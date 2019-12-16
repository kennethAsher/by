package org.elasticsearch.hadoop.cfg;

import java.io.InputStream;
import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.elasticsearch.hadoop.mr.HadoopCfgUtils;
import org.elasticsearch.hadoop.mr.HadoopIOUtils;
import org.elasticsearch.hadoop.util.Assert;

public class HadoopSettings extends Settings {

    private final Configuration cfg;

//    构造类
    public HadoopSettings(Configuration cfg) {
        Assert.notNull(cfg, "Non-null properties expected");
        this.cfg = cfg;
    }

    @Override
    public String getProperty(String name) {
        return cfg.get(name);
    }

    @Override
    public void setProperty(String name, String value) {
        cfg.set(name, value);
    }

    public Settings copy() {
        // force internal init
        cfg.size();
        return new HadoopSettings(new Configuration(cfg));
    }


}
