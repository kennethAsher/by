package org.elasticsearch.hadoop.security;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum AuthenticationMethod {
    SIMPLE("simple"),
    BASIC("basic"),
    PKI("pki"),
    KERBEROS("kerberos");

    private final static Map<String, AuthenticationMethod> REGISTRY = new HashMap<String, AuthenticationMethod>(4);
    static {
        REGISTRY.put(SIMPLE.value, SIMPLE);
        REGISTRY.put(BASIC.value, BASIC);
        REGISTRY.put(PKI.value, PKI);
        REGISTRY.put(KERBEROS.value, KERBEROS);
    }

    public static AuthenticationMethod get(String value) {
        return REGISTRY.get(value);
    }

    public static List<String> getAvailableMethods() {
        return Arrays.asList(SIMPLE.value, BASIC.value, PKI.value, KERBEROS.value);
    }

    private final String value;
    AuthenticationMethod(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
