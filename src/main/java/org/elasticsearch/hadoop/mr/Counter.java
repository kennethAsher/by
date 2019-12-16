package org.elasticsearch.hadoop.mr;

import java.util.EnumSet;
import java.util.Set;
import org.elasticsearch.hadoop.rest.stats.Stats;

public enum  Counter {

    BYTES_SENT {
        public long get(Stats stats) {
            return stats.bytesSent;
        }
    },
    DOCS_SENT {
        public long get(Stats stats) {
            return stats.docsSent;
        }
    },
    BYTES_ACCEPTED {
        public long get(Stats stats) {
            return stats.bytesAccepted;
        }
    },
    DOCS_ACCEPTED {
        public long get(Stats stats) {
            return stats.docsAccepted;
        }
    },
    DOCS_RETRIED {
        public long get(Stats stats) {
            return stats.docsRetried;
        }
    },
    BYTES_RETRIED {
        public long get(Stats stats) {
            return stats.bytesRetried;
        }
    },
    BYTES_RECEIVED {
        public long get(Stats stats) {
            return stats.bytesReceived;
        }
    },
    DOCS_RECEIVED {
        public long get(Stats stats) {
            return stats.docsReceived;
        }
    },
    BULK_TOTAL {
        public long get(Stats stats) {
            return stats.bulkTotal;
        }
    },
    BULK_RETRIES {
        public long get(Stats stats) {
            return stats.bulkRetries;
        }
    },
    NODE_RETRIES {
        public long get(Stats stats) {
            return stats.nodeRetries;
        }
    },
    NET_RETRIES {
        public long get(Stats stats) {
            return stats.netRetries;
        }
    },
    NET_TOTAL_TIME_MS {
        public long get(Stats stats) {
            return stats.netTotalTime;
        }
    },
    BULK_TOTAL_TIME_MS {
        public long get(Stats stats) {
            return stats.bulkTotalTime;
        }
    },
    BULK_RETRIES_TOTAL_TIME_MS {
        public long get(Stats stats) {
            return stats.bulkRetriesTotalTime;
        }
    },
    SCROLL_TOTAL {
        public long get(Stats stats) {
            return stats.scrollTotal;
        }
    },
    SCROLL_TOTAL_TIME_MS {
        public long get(Stats stats) {
            return stats.scrollTotalTime;
        }
    };

    public static final Set<Counter> ALL = EnumSet.allOf(Counter.class);
    public abstract long get(Stats stats);
}
