package org.elasticsearch.hadoop.serialization.field;

import org.elasticsearch.hadoop.util.ObjectUtils;

public class DefaultIndexExtractor extends AbstractIndexExtractor{

    protected FieldExtractor createFieldExtractor(String fieldName) {
        settings.setProperty(ConstantFieldExtractor.PROPERTY, fieldName);
        return ObjectUtils.instantiate(settings.getMappingDefaultClassExtractor(), settings);
    }

}
