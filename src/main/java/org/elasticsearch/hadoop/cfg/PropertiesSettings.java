package org.elasticsearch.hadoop.cfg;

import java.io.InputStream;
import java.util.Properties;

import org.elasticsearch.hadoop.util.Assert;
import org.elasticsearch.hadoop.util.IOUtils;


public class PropertiesSettings extends Settings{

    protected final Properties props;

    public PropertiesSettings() {
        this(new Properties());
    }
    public PropertiesSettings(Properties props) {
        Assert.notNull(props, "Non-null properties expected");
        this.props = props;
    }

    public String getProperty(String name) {
        return props.getProperty(name);
    }
    public void setProperty(String name, String value) {
        props.setProperty(name, value);
    }
    public Settings copy() {
        return new PropertiesSettings((Properties) props.clone());
    }
//    将字符串加载成加载成配置
    public InputStream loadResource(String location) {
        return IOUtils.open(location, PropertiesSettings.class.getClassLoader());
    }
//    返回配置文件
    public Properties asProperties() {
        return props;
    }
//    从字符串中得到配置参数
    public static Settings readFrom(String ser) {
        return new PropertiesSettings(new Properties()).load(ser);
    }

}
