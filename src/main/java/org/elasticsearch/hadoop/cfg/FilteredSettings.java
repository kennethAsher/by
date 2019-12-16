package org.elasticsearch.hadoop.cfg;

import java.io.InputStream;
import java.util.Properties;

public class FilteredSettings extends Settings{

    private final Settings parent;
    private final String excludePrefix;

    FilteredSettings(Settings parent, String excludePrefix) {
        this.parent = parent;
        if (excludePrefix.endsWith(".")) {
            this.excludePrefix = excludePrefix;
        } else {
            this.excludePrefix = excludePrefix + ".";
        }
    }

    private boolean validKey(String key) {
        return !key.startsWith(excludePrefix);
    }

    public InputStream loadResource(String location) {
        return parent.loadResource(location);
    }

    public Settings copy() {
        return new FilteredSettings(parent.copy(), excludePrefix);
    }

    public String getProperty(String name) {
        if (validKey(name)) {
            return parent.getProperty(name);
        } else {
            return null;
        }
    }

    public void setProperty(String name, String value) {
        // Ignore the update if it is an excluded key as it will not be readable after setting anyway
        if (validKey(name)) {
            parent.setProperty(name, value);
        }
    }

    public Properties asProperties() {
        Properties parentSettings = parent.asProperties();
        Properties filteredProperties = new Properties();
        for (Object keyObject : parentSettings.keySet()) {
            String key = keyObject.toString();
            if (validKey(key)) {
                filteredProperties.put(key, parentSettings.getProperty(key));
            }
        }
        return filteredProperties;
    }
}
