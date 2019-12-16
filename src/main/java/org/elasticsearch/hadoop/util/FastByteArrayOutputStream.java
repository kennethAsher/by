package org.elasticsearch.hadoop.util;

import java.io.IOException;
import java.io.OutputStream;

import org.elasticsearch.hadoop.EsHadoopIllegalArgumentException;

public class FastByteArrayOutputStream extends OutputStream {

    private BytesArray data;
    /**
     * Creates a new byte array output stream. The buffer capacity is
     * initially 1024 bytes, though its size increases if necessary.
     * <p/>
     * ES: We use 1024 bytes since we mainly use this to build json/smile
     * content in memory, and rarely does the 32 byte default in ByteArrayOutputStream fits...
     */
    public FastByteArrayOutputStream() {
        this(1024);
    }

    /**
     * Creates a new byte array output stream, with a buffer capacity of
     * the specified size, in bytes.
     *
     * @param size the initial size.
     * @throws EsHadoopIllegalArgumentException if size is negative.
     */

    public FastByteArrayOutputStream(int size) {
        Assert.isTrue(size >= 0, "Negative initial size: " + size);
        data = new BytesArray(size);
    }

    public FastByteArrayOutputStream(BytesArray data) {
        this.data = data;
    }

    public void write(int b) {
        data.add(b);
    }

    public void write(byte b[], int off, int len) {
        data.add(b, off, len);
    }

    public void writeTo(OutputStream out) throws IOException {
        out.write(data.bytes, 0, data.size);
    }

    public BytesArray bytes() {
        return data;
    }

    public void setBytes(byte[] data, int size) {
        this.data.bytes(data, size);
    }

    public long size() {
        return data.length();
    }

    public void reset() {
        data.reset();
    }

    public String toString() {
        return data.toString();
    }

    public void close() throws IOException {}
}
