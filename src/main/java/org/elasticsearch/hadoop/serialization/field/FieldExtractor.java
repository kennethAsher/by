package org.elasticsearch.hadoop.serialization.field;



public interface FieldExtractor {

    Object NOT_FOUND = new Object();
    Object SKIP = new Object();
    Object field(Object target);
}
