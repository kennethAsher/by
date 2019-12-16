package org.elasticsearch.hadoop.serialization;

import org.elasticsearch.hadoop.EsHadoopException;

public class EsHadoopSerializationException extends EsHadoopException{

    public EsHadoopSerializationException() {
        super();
    }

    public EsHadoopSerializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public EsHadoopSerializationException(String message) {
        super(message);
    }

    public EsHadoopSerializationException(Throwable cause) {
        super(cause);
    }
}
