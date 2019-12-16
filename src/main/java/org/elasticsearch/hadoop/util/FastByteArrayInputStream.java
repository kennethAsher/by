package org.elasticsearch.hadoop.util;

import java.io.InputStream;

public class FastByteArrayInputStream extends InputStream {

    protected BytesArray data;
    protected int offset;
    protected int pos;
    protected int mark = 0;
    protected int count;

    public FastByteArrayInputStream(byte[] rawData) {
        this(new BytesArray(rawData));
    }
    public FastByteArrayInputStream(BytesArray data) {
        this.data = data;
        this.pos = data.offset;
        this.offset = data.offset;
        this.count = data.offset + data.size;
    }

    public int read() {
        return (pos < count) ? (data.bytes[pos++] & 0xff) : -1;
    }
    public int read(byte b[], int off, int len) {
        if (b == null) {
            throw new NullPointerException();
        }
        else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        }
        if (pos >= count) {
            return -1;
        }
        if (pos + len > count) {
            len = count - pos;
        }
        if (len <= 0) {
            return 0;
        }
        System.arraycopy(data.bytes, pos, b, off, len);
        pos += len;
        return len;
    }
    public long skip(long n) {
        if (pos + n > count) {
            n = count - pos;
        }
        if (n < 0) {
            return 0;
        }
        pos += n;
        return n;
    }
    public int available() {
        return count - pos;
    }
    public int position() {
        return pos - offset;
    }
    public boolean markSupported() {
        return true;
    }
    public void mark(int readAheadLimit) {
        mark = pos;
    }
    public void reset() {
        pos = mark;
    }
    public void close() {}
    public BytesArray bytes() {
        return data;
    }
    public void setBytes(byte[] data, int size) {
        this.data.bytes(data, size);
    }
}
