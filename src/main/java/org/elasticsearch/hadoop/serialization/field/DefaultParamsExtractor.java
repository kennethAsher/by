package org.elasticsearch.hadoop.serialization.field;

import org.elasticsearch.hadoop.util.ObjectUtils;

public class DefaultParamsExtractor extends AbstractDefaultParamsExtractor {

    protected FieldExtractor createFieldExtractor(String fieldName) {
        settings.setProperty(ConstantFieldExtractor.PROPERTY, fieldName);
        return ObjectUtils.<FieldExtractor> instantiate(settings.getMappingDefaultClassExtractor(), settings);
    }
}
