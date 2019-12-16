package org.elasticsearch.hadoop.util.unit;

public enum ByteSizeUnit {
    BYTES {
        public long toBytes(long size) {
            return size;
        }
        public long toKB(long size) {
            return size / (C1 / C0);
        }
        public long toMB(long size) {
            return size / (C2 / C0);
        }
        public long toGB(long size) {
            return size / (C3 / C0);
        }
    },
    KB {
        public long toBytes(long size) {
            return x(size, C1 / C0, MAX / (C1 / C0));
        }
        public long toKB(long size) {
            return size;
        }
        public long toMB(long size) {
            return size / (C2 / C1);
        }
        public long toGB(long size) {
            return size / (C3 / C1);
        }
    },
    MB {
        public long toBytes(long size) {
            return x(size, C2 / C0, MAX / (C2 / C0));
        }
        public long toKB(long size) {
            return x(size, C2 / C1, MAX / (C2 / C1));
        }
        public long toMB(long size) {
            return size;
        }
        public long toGB(long size) {
            return size / (C3 / C2);
        }
    },
    GB {
        public long toBytes(long size) {
            return x(size, C3 / C0, MAX / (C3 / C0));
        }

        public long toKB(long size) {
            return x(size, C3 / C1, MAX / (C3 / C1));
        }

        public long toMB(long size) {
            return x(size, C3 / C2, MAX / (C3 / C2));
        }

        public long toGB(long size) {
            return size;
        }
    };

    static final long C0 = 1L;
    static final long C1 = C0 * 1024L;
    static final long C2 = C1 * 1024L;
    static final long C3 = C2 * 1024L;
    static final long MAX = Long.MAX_VALUE;

    static long x(long d, long m, long over) {
        if (d > over)
            return Long.MAX_VALUE;
        if (d < -over)
            return Long.MIN_VALUE;
        return d * m;
    }

    public abstract long toBytes(long size);

    public abstract long toKB(long size);

    public abstract long toMB(long size);

    public abstract long toGB(long size);
}
