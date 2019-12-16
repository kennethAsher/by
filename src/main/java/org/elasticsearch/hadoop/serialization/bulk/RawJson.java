package org.elasticsearch.hadoop.serialization.bulk;

import org.elasticsearch.hadoop.util.StringUtils;

public class RawJson {
    private final String source;
    public RawJson(String source) {
        this.source = source;
    }
    public byte[] json() {
        return StringUtils.toUTF(source);
    }
    public String toString() {
        return source;
    }
    public int hashCode() {
        return (source == null ? 0 : source.hashCode());
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RawJson other = (RawJson) obj;
        if (source == null) {
            if (other.source != null)
                return false;
        }
        else if (!source.equals(other.source))
            return false;
        return true;
    }
}
