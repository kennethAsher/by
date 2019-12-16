package org.elasticsearch.hadoop.util;

import java.lang.reflect.Array;

import org.elasticsearch.hadoop.EsHadoopIllegalArgumentException;
import org.elasticsearch.hadoop.EsHadoopIllegalStateException;
import org.elasticsearch.hadoop.cfg.Settings;
import org.elasticsearch.hadoop.serialization.SettingsAware;

public abstract class ObjectUtils {

    public static <T> T instantiate(String className, ClassLoader loader) {
        Assert.hasText(className, "No class name given");
        ClassLoader cl = (loader != null ? loader : ObjectUtils.class.getClassLoader());
        Class<?> clz = null;
        try {
            clz = cl.loadClass(className);
        } catch (ClassNotFoundException e) {
            throw new EsHadoopIllegalStateException(String.format("Cannot load class [%s]", className), e);
        }
        try {
            return (T) clz.newInstance();
        } catch (Exception ex) {
            throw new EsHadoopIllegalStateException(String.format("Cannot instantiate class [%s]", className), ex);
        }
    }
    public static <T> T instantiate(String className, Settings settings) {
        return instantiate(className, null, settings);
    }
    public static <T> T instantiate(String className, ClassLoader loader, Settings settings) {
        T obj = instantiate(className, loader);

        if (obj instanceof SettingsAware) {
            ((SettingsAware) obj).setSettings(settings);
        }
        return obj;
    }

    public static boolean isClassPresent(String className, ClassLoader cl) {
        Class<?> clz = null;
        try {
            clz = Class.forName(className, false, cl);
        } catch (Exception ex) {
            // ignore
        }
        return (clz != null);
    }
//    返回映射的class
    public static Class<?> loadClass(String className, ClassLoader cl) {
        try {
            return Class.forName(className, true, cl);
        } catch (ClassNotFoundException ex) {
            throw new EsHadoopIllegalArgumentException(String.format("Cannot load class [%s]", className), ex);
        }
    }

    public static boolean isEmpty(byte[] array) {
        return (array == null || array.length == 0);
    }
    public static boolean isEmpty(Object[] array) {
        return (array == null || array.length == 0);
    }
//    将字符串返回成object数组
    public static Object[] toObjectArray(Object source) {
        if (source instanceof Object[]) {
            return (Object[]) source;
        }
        if (source == null) {
            return new Object[0];
        }
        if (!source.getClass().isArray()) {
            throw new IllegalArgumentException("Source is not an array: " + source);
        }
        int length = Array.getLength(source);
        if (length == 0) {
            return new Object[0];
        }
        Class<?> wrapperType = Array.get(source, 0).getClass();
        Object[] newArray = (Object[]) Array.newInstance(wrapperType, length);
        for (int i = 0; i < length; i++) {
            newArray[i] = Array.get(source, i);
        }
        return newArray;
    }
}
