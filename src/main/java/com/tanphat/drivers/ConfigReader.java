package com.tanphat.drivers;

import com.tanphat.utils.LogUtils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties props = new Properties();
    static {
        try (InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("android.properties")) {
            LogUtils.info("Get android Properties");
            if (is == null) throw new RuntimeException("android.properties not found in classpath");
            props.load(is);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load android.properties", e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key).trim();
    }
}
