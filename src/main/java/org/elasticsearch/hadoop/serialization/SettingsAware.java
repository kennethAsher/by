package org.elasticsearch.hadoop.serialization;

import org.elasticsearch.hadoop.cfg.Settings;

public interface SettingsAware {
    void setSettings(Settings settings);
}
