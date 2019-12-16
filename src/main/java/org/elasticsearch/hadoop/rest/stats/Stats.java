package org.elasticsearch.hadoop.rest.stats;

public class Stats {

    /** sent */
    public long bytesSent;
    public long docsSent;
    public long docsRetried;
    public long bytesRetried;
    /** ack */
    public long bytesAccepted;
    public long docsAccepted;
    /** reads */
    public long bytesReceived;
    public long docsReceived;
    /** bulk */
    public long bulkTotal;
    public long bulkRetries;
    /** fall overs */
    public int nodeRetries;
    public int netRetries;
    /** time measured (in millis)*/
    public long netTotalTime;
    public long bulkTotalTime;
    public long bulkRetriesTotalTime;
    /** scroll */
    public long scrollTotalTime;
    public long scrollTotal;

    public Stats() {};
    public Stats(Stats stats) {
        if (stats == null) {
            return;
        }

        this.bytesSent = stats.bytesSent;
        this.docsSent = stats.docsSent;
        this.bulkTotal = stats.bulkTotal;

        this.docsRetried = stats.docsRetried;
        this.bytesRetried = stats.bytesRetried;
        this.bulkRetries = stats.bulkRetries;

        this.bytesAccepted = stats.bytesAccepted;
        this.docsAccepted = stats.docsAccepted;

        this.bytesReceived = stats.bytesReceived;
        this.docsReceived = stats.docsReceived;

        this.nodeRetries = stats.nodeRetries;
        this.netRetries = stats.netRetries;

        this.netTotalTime = stats.netTotalTime;
        this.bulkTotalTime = stats.bulkTotalTime;
        this.bulkRetriesTotalTime = stats.bulkRetriesTotalTime;

        this.scrollTotal = stats.scrollTotal;
        this.scrollTotalTime = stats.scrollTotalTime;
    }
    public Stats aggregate(Stats other) {
        if (other == null) {
            return this;
        }

        bytesSent += other.bytesSent;
        docsSent += other.docsSent;
        bulkTotal += other.bulkTotal;
        docsRetried += other.docsRetried;
        bytesRetried += other.bytesRetried;
        bulkRetries += other.bulkRetries;
        bytesAccepted += other.bytesAccepted;
        docsAccepted += other.docsAccepted;

        bytesReceived += other.bytesReceived;
        docsReceived += other.docsReceived;

        nodeRetries += other.nodeRetries;
        netRetries += other.netRetries;

        netTotalTime += other.netTotalTime;
        bulkTotalTime += other.bulkTotalTime;
        bulkRetriesTotalTime += other.bulkRetriesTotalTime;

        scrollTotal += other.scrollTotal;
        scrollTotalTime += other.scrollTotalTime;

        return this;
    }
}
