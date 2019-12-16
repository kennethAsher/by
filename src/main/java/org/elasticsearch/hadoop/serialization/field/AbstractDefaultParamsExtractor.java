package org.elasticsearch.hadoop.serialization.field;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.elasticsearch.hadoop.cfg.Settings;
import org.elasticsearch.hadoop.serialization.SettingsAware;
import org.elasticsearch.hadoop.serialization.bulk.RawJson;
import org.elasticsearch.hadoop.util.Assert;
import org.elasticsearch.hadoop.util.StringUtils;

public abstract class AbstractDefaultParamsExtractor implements FieldExtractor, SettingsAware, FieldExplainer {

    private final Map<String, FieldExtractor> params = new LinkedHashMap<String, FieldExtractor>();
    protected Settings settings;
    // field explainer saved in case of a failure for diagnostics
    private FieldExtractor lastFailingFieldExtractor;
//    返回list，里面都是rawjson类对象
    public Object field(Object target) {
        List<Object> list = new ArrayList<Object>(params.size());
        int entries = 0;
        // construct the param list but keep the value exposed to be properly transformed (if it's extracted from the runtime)
        list.add(new RawJson("{"));
        for (Entry<String, FieldExtractor> entry : params.entrySet()) {
            String val = StringUtils.toJsonString(entry.getKey()) + ":";
            if (entries > 0) {
                val = "," + val;
            }
            list.add(new RawJson(val));
            Object field = entry.getValue().field(target);
            if (field == FieldExtractor.NOT_FOUND) {
                lastFailingFieldExtractor = entry.getValue();
                return FieldExtractor.NOT_FOUND;
            }
            // add the param as is - it will be translated to JSON as part of the list later
            list.add(field);
            entries++;
        }
        list.add(new RawJson("}"));
        return list;
    }
    public String toString(Object target) {
        return (lastFailingFieldExtractor instanceof FieldExplainer ? ((FieldExplainer) lastFailingFieldExtractor).toString(target) : target.toString());
    }

    public void setSettings(Settings settings) {
        this.settings = settings;

        String paramString = settings.getUpdateScriptParams();
        List<String> fields = StringUtils.tokenize(paramString);
        for (String string : fields) {
            List<String> param = StringUtils.tokenize(string, ":");
            Assert.isTrue(param.size() == 2, "Invalid param definition " + string);

            params.put(param.get(0), createFieldExtractor(param.get(1)));
        }
    }
    public String toString() {
        if (lastFailingFieldExtractor != null) {
            return lastFailingFieldExtractor.toString();
        }

        return String.format("%s for fields [%s]", getClass().getSimpleName(), params.keySet());
    }
    protected abstract FieldExtractor createFieldExtractor(String fieldName);

}
