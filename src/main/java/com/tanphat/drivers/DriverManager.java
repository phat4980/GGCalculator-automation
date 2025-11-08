package com.tanphat.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class DriverManager {
    private static AppiumDriver driver;

    public static AppiumDriver startDriver() {
        if(driver == null) {
            initDriver();
        }
        return driver;
    }

    private static void initDriver() {
        try {
            String appiumServer = ConfigReader.get("appiumDriver");
            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName(ConfigReader.get("platformName"))
                    .setAutomationName(ConfigReader.get("automationName"))
                    .setDeviceName(ConfigReader.get("deviceName"))
                    .setPlatformVersion(ConfigReader.get("platformVersion"))
//                    .setApp(resolveAppPath(ConfigReader.get("app")))
                    .setAppPackage(ConfigReader.get("appPackage"))
                    .setAppActivity(ConfigReader.get("appActivity"))
                    .setNewCommandTimeout(Duration.ofSeconds(30));

            URL serverUrl = URI.create(appiumServer).toURL();
            driver = new AndroidDriver(serverUrl, options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        } catch (MalformedURLException e) {
            throw new RuntimeException("Failed to initialize Android driver: " + e.getMessage(), e);
        }
    }

    private static String resolveAppPath(String app) {
        String baseDir = System.getProperty("user.dir");
        java.io.File file = new java.io.File(baseDir, app);

        if (!file.exists()) {
            throw new RuntimeException("App file not found: " + file.getAbsolutePath());
        }

        return file.getAbsolutePath();
    }

    public static AppiumDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Not find Appium Driver");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception ignored) {
            }
            driver = null;
        }
    }
}
