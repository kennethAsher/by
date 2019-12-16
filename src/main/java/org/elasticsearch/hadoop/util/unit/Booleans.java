package org.elasticsearch.hadoop.util.unit;

import java.util.Locale;

public abstract class Booleans {

    public static boolean parseBoolean(String value) {
        return parseBoolean(value, false);
    }
//    返回输入的值正确行
    public static boolean parseBoolean(String value, boolean defaultValue) {
        if (value == null) {
            return defaultValue;
        }
        String val = value.trim().toLowerCase(Locale.ROOT);
        return !(val.isEmpty() || val.equals("false") || val.equals("0") || val.equals("off") || val.equals("no"));
    }
}
