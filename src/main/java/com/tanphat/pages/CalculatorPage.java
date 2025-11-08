package com.tanphat.pages;

import com.tanphat.base.BasePage;
import com.tanphat.locators.MainCalculatorLocators;
import com.tanphat.utils.LogUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class CalculatorPage extends BasePage {
    public CalculatorPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }

    // Numbers
    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_0)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn0;

    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_1)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn1;

    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_2)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn2;

    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_3)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn3;

    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_4)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn4;

    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_5)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn5;

    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_6)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn6;

    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_7)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn7;

    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_8)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn8;

    @AndroidFindBy(id = MainCalculatorLocators.DIGIT_9)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btn9;

    // Operations 1
    @AndroidFindBy(id = MainCalculatorLocators.OP_ADD)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnAdd;

    @AndroidFindBy(id = MainCalculatorLocators.OP_SUB)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnSubtract;

    @AndroidFindBy(id = MainCalculatorLocators.OP_MUL)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnMultiply;

    @AndroidFindBy(id = MainCalculatorLocators.OP_DIV)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnDivide;

    @AndroidFindBy(id = MainCalculatorLocators.DEC_POINT)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnDecimal;

    @AndroidFindBy(id = MainCalculatorLocators.OP_PERCENT)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnPercent;

    @AndroidFindBy(id = MainCalculatorLocators.PARENTHESIS)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnParenthesis;

    @AndroidFindBy(id = MainCalculatorLocators.EQUAL)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnEqual;

    // Controls
    @AndroidFindBy(id = MainCalculatorLocators.DEL)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnDel;

    @AndroidFindBy(id = MainCalculatorLocators.CLEAR)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnClear;

    // Operations 2
    @AndroidFindBy(id = MainCalculatorLocators.OP_SQUARE)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnSquare;

    @AndroidFindBy(id = MainCalculatorLocators.OP_PI)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnPi;

    @AndroidFindBy(id = MainCalculatorLocators.OP_POWER)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnPower;

    @AndroidFindBy(id = MainCalculatorLocators.OP_FACTORIAL)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement btnFactor;

    // Output
    @AndroidFindBy(id = MainCalculatorLocators.FORMULAR)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement txtFormular;

    @AndroidFindBy(id = MainCalculatorLocators.RESULT_REVIEW)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement txtResultReview;

    @AndroidFindBy(id = MainCalculatorLocators.RESULT_FINAL)
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private WebElement txtResultFinal;

    // Actions
    public void enterNumber(String num) {
        for (Character digit : num.toCharArray()) {
            switch (digit) {
                case '0':
                    LogUtils.info("Clicking 0 digit");
                    waitAndClick(btn0);
                    break;
                case '1':
                    LogUtils.info("Clicking 1 digit");
                    waitAndClick(btn1);
                    break;
                case '2':
                    LogUtils.info("Clicking 2 digit");
                    waitAndClick(btn2);
                    break;
                case '3':
                    LogUtils.info("Clicking 3 digit");
                    waitAndClick(btn3);
                    break;
                case '4':
                    LogUtils.info("Clicking 4 digit");
                    waitAndClick(btn4);
                    break;
                case '5':
                    LogUtils.info("Clicking 5 digit");
                    waitAndClick(btn5);
                    break;
                case '6':
                    LogUtils.info("Clicking 6 digit");
                    waitAndClick(btn6);
                    break;
                case '7':
                    LogUtils.info("Clicking 7 digit");
                    waitAndClick(btn7);
                    break;
                case '8':
                    LogUtils.info("Clicking 8 digit");
                    waitAndClick(btn8);
                    break;
                case '9':
                    LogUtils.info("Clicking 9 digit");
                    waitAndClick(btn9);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid digit" + digit);
            }
        }
    }

    public void add() {
        LogUtils.info("Clicking add button");
        waitAndClick(btnAdd);
    }

    public void subtract() {
        LogUtils.info("Clicking subtract button");
        waitAndClick(btnSubtract);
    }

    public void multiply() {
        LogUtils.info("Clicking multiply button");
        waitAndClick(btnMultiply);
    }

    public void divide() {
        LogUtils.info("Clicking divide button");
        waitAndClick(btnDivide);
    }

    public void decimal() {
        LogUtils.info("Clicking decimal button");
        waitAndClick(btnDecimal);
    }

    public void percent() {
        LogUtils.info("Clicking percent button");
        waitAndClick(btnPercent);
    }

    public void parenthesis() {
        LogUtils.info("Clicking parenthesis button");
        waitAndClick(btnParenthesis);
    }

    public void equal() {
        LogUtils.info("Clicking equal button");
        waitAndClick(btnEqual);
    }

    public void delete() {
        LogUtils.info("Clicking delete button");
        waitAndClick(btnDel);
    }

    public void clear() {
        LogUtils.info("Clicking clear button");
        waitAndClick(btnClear);
    }

    public void square() {
        LogUtils.info("Clicking square button");
        waitAndClick(btnSquare);
    }

    public void pi() {
        LogUtils.info("Clicking Pi button");
        waitAndClick(btnPi);
    }

    public void power() {
        LogUtils.info("Clicking power button");
        waitAndClick(btnPower);
    }

    public void factorial() {
        LogUtils.info("Clicking factorial button");
        waitAndClick(btnFactor);
    }

    public String getFormula() {
        LogUtils.info("Get formula text");
        waitForTextToBePresent(txtFormular, txtFormular.getText());
        return txtFormular.getText();
    }

    public String getResultReview() {
        LogUtils.info("Get result review text");
        waitForTextToBePresent(txtResultReview, txtResultReview.getText());
        return txtResultReview.getText();
    }

    public String getResultFinal() {
        LogUtils.info("Get result final text");
        waitForTextToBePresent(txtResultFinal, txtResultFinal.getText());
        return txtResultFinal.getText();
    }
}
