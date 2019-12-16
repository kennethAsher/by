package org.elasticsearch.hadoop.util;

public class ClusterName {
    private static final long serialVersionUID = 1L;
    public static final String UNNAMED_CLUSTER_NAME = "!UNNAMED!";

    private final String clusterName;
    private final String clusterUUID;

    public ClusterName(String clusterName, String clusterUUID) {
        this.clusterName = clusterName;
        this.clusterUUID = clusterUUID;
    }
    public String getName() {
        return clusterName;
    }
    public String getUUID() {
        return clusterUUID;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterName that = (ClusterName) o;

        if (clusterName != null ? !clusterName.equals(that.clusterName) : that.clusterName != null) return false;
        return clusterUUID != null ? clusterUUID.equals(that.clusterUUID) : that.clusterUUID == null;
    }

    @Override
    public int hashCode() {
        int result = clusterName != null ? clusterName.hashCode() : 0;
        result = 31 * result + (clusterUUID != null ? clusterUUID.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ClusterName{" +
                "clusterName='" + clusterName + '\'' +
                ", clusterUUID='" + clusterUUID + '\'' +
                '}';
    }
}
