package org.elasticsearch.hadoop.rest;

import java.io.InputStream;

public interface Response {

    int status();

    String statusDescription();

    InputStream body();

    CharSequence uri();

    boolean isInformal();

    boolean isSuccess();

    boolean isRedirection();

    boolean isClientError();

    boolean isServerError();

    boolean hasSucceeded();

    boolean hasFailed();
}