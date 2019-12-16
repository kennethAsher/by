package org.elasticsearch.hadoop.cfg;

import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.elasticsearch.hadoop.EsHadoopIllegalArgumentException;

public class HadoopSettingsManager implements SettingsManager<Object> {

    private final static Class<?> HADOOP_CONFIGURATION;
//    反射到环境所需要的配置类
    static {
        Class<?> cfgClass = null;
        try {
            cfgClass = Class.forName("org.apache.hadoop.conf.Configuration", false, HadoopSettingsManager.class.getClassLoader());
        } catch (Exception ex) {
            // ignore
        }
        HADOOP_CONFIGURATION = cfgClass;
    }
//    返回hadoopconfiguration类所需的配置
    private abstract static class FromHadoopConfiguration {
        public static Settings create(Object cfg) {
            return new HadoopSettings((Configuration) cfg);
        }
    }
//    返回配置参数-setting的的形式
    public static Settings loadFrom(Object configuration) {
        if (configuration instanceof Properties) {
            return new PropertiesSettings((Properties) configuration);
        }
        if (HADOOP_CONFIGURATION != null && HADOOP_CONFIGURATION.isInstance(configuration)) {
            return FromHadoopConfiguration.create(configuration);
        }
        throw new EsHadoopIllegalArgumentException("Don't know how to create Settings from configuration " + configuration);
    }
    //    返回配置参数-setting的的形式
    public Settings load(Object configuration) {
        return loadFrom(configuration);
    }
}
