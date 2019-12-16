package org.elasticsearch.hadoop.cfg;

public interface SettingsManager<T> {
    Settings load(T configuration);
}
