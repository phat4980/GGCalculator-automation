package com.tanphat.base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void waitForElementVisible(WebElement locator) {
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(locator));
    }

    public void waitForElementClickable(WebElement locator) {
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(locator));

    }

    public void waitAndClick(WebElement locator) {
        waitForElementClickable(locator);
        locator.click();
    }

    public void waitForTextToBePresent(WebElement locator, String text) {
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.textToBePresentInElement(locator, text));
    }
}
