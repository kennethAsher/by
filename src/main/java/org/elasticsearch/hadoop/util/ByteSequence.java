package org.elasticsearch.hadoop.util;

import java.io.IOException;
import java.io.OutputStream;

public interface ByteSequence {
    int length();
    void writeTo(OutputStream out) throws IOException;
}
