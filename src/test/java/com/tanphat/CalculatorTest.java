package com.tanphat;

import com.tanphat.drivers.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    @BeforeClass
    public void setup() {
        DriverManager.getDriver();
    }

    @Test
    public void verifyCalculateDisplay() {
        System.out.println("Displayed!!");
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
