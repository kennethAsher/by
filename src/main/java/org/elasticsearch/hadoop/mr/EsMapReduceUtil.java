package org.elasticsearch.hadoop.mr;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.Job;
import org.elasticsearch.hadoop.EsHadoopException;
import org.elasticsearch.hadoop.EsHadoopIllegalArgumentException;
import org.elasticsearch.hadoop.cfg.ConfigurationOptions;
import org.elasticsearch.hadoop.cfg.HadoopSettingsManager;
import org.elasticsearch.hadoop.cfg.Settings;
import org.elasticsearch.hadoop.mr.security.HadoopUserProvider;
import org.elasticsearch.hadoop.mr.security.TokenUtil;
import org.elasticsearch.hadoop.rest.InitializationUtils;
import org.elasticsearch.hadoop.rest.RestClient;
import org.elasticsearch.hadoop.security.User;
import org.elasticsearch.hadoop.security.UserProvider;
import org.elasticsearch.hadoop.util.ClusterInfo;

public class EsMapReduceUtil {
    private static final Log LOG = LogFactory.getLog(EsMapReduceUtil.class);
    private EsMapReduceUtil() { /* No instances */ }
    public static void initCredentials(Job job) {
        Configuration configuration = job.getConfiguration();
        Settings settings = HadoopSettingsManager.loadFrom(configuration);
        InitializationUtils.setUserProviderIfNotSet(settings, HadoopUserProvider.class, LOG);
        UserProvider userProvider = UserProvider.create(settings);

        if (userProvider.isEsKerberosEnabled()) {
            User user = userProvider.getUser();
            ClusterInfo clusterInfo = settings.getClusterInfoOrNull();
            RestClient bootstrap = new RestClient(settings);
            try {
                // first get ES main action info if it's missing
                if (clusterInfo == null) {
                    clusterInfo = bootstrap.mainInfo();
                }
                // Add the token to the job
                TokenUtil.addTokenForJob(bootstrap, clusterInfo.getClusterName(), user, job);
            } catch (EsHadoopException ex) {
                throw new EsHadoopIllegalArgumentException(String.format("Cannot detect ES version - "
                        + "typically this happens if the network/Elasticsearch cluster is not accessible or when targeting "
                        + "a WAN/Cloud instance without the proper setting '%s'", ConfigurationOptions.ES_NODES_WAN_ONLY), ex);
            } finally {
                bootstrap.close();
            }
        } else {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Ignoring Elasticsearch credentials since Kerberos Auth is not enabled.");
            }
        }
    }
}
