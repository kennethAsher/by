package org.elasticsearch.hadoop.serialization.field;

public interface IndexFormatter {
    void configure(String format);
    String format(String value);
}
