package org.elasticsearch.hadoop.serialization.field;

import java.util.List;

import org.elasticsearch.hadoop.cfg.Settings;
import org.elasticsearch.hadoop.serialization.SettingsAware;
import org.elasticsearch.hadoop.util.StringUtils;

public class ConstantFieldExtractor implements FieldExtractor, SettingsAware {
    public static final String PROPERTY = "org.elasticsearch.hadoop.serialization.ConstantFieldExtractor.property";
    private List<String> fieldNames;
    private Object value;
    private boolean autoQuote = true;

    public final Object field(Object target) {
        return (value != null ? value : (fieldNames == null || fieldNames.isEmpty() ? NOT_FOUND : extractField(target)));
    }
    protected Object extractField(Object target) {
        return NOT_FOUND;
    }

    public void setSettings(Settings settings) {
        autoQuote = settings.getMappingConstantAutoQuote();
        String fldName = property(settings);
        if (fldName.startsWith("<") && fldName.endsWith(">")) {
            value = initValue(fldName.substring(1, fldName.length() - 1));
        }
        if (value == null) {
            fieldNames = StringUtils.tokenize(fldName, ".");
            processField(settings, fieldNames);
        }
    }
}
