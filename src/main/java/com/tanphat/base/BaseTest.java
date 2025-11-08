package com.tanphat.base;

import com.tanphat.drivers.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass(alwaysRun = true)
    public void setup() {
        DriverManager.startDriver();
    }

    public AppiumDriver getDriver() {
        return DriverManager.getDriver();
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        DriverManager.quitDriver();
    }
}
