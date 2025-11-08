package com.tanphat.pages;

import com.tanphat.base.BasePage;
import com.tanphat.locators.MainCalculatorLocators;
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
                    waitAndClick(btn0);
                    break;
                case '1':
                    waitAndClick(btn1);
                    break;
                case '2':
                    waitAndClick(btn2);
                    break;
                case '3':
                    waitAndClick(btn3);
                    break;
                case '4':
                    waitAndClick(btn4);
                    break;
                case '5':
                    waitAndClick(btn5);
                    break;
                case '6':
                    waitAndClick(btn6);
                    break;
                case '7':
                    waitAndClick(btn7);
                    break;
                case '8':
                    waitAndClick(btn8);
                    break;
                case '9':
                    waitAndClick(btn9);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid digit" + digit);
            }
        }
    }

    public void add() {
        waitAndClick(btnAdd);
    }

    public void subtract() {
        waitAndClick(btnSubtract);
    }

    public void multiply() {
        waitAndClick(btnMultiply);
    }

    public void divide() {
        waitAndClick(btnDivide);
    }

    public void decimal() {
        waitAndClick(btnDecimal);
    }

    public void percent() {
        waitAndClick(btnPercent);
    }

    public void parenthesis() {
        waitAndClick(btnParenthesis);
    }

    public void equal() {
        waitAndClick(btnEqual);
    }

    public void delete() {
        waitAndClick(btnDel);
    }

    public void clear() {
        waitAndClick(btnClear);
    }

    public void square() {
        waitAndClick(btnSquare);
    }

    public void pi() {
        waitAndClick(btnPi);
    }

    public void power() {
        waitAndClick(btnPower);
    }

    public void factorial() {
        waitAndClick(btnFactor);
    }

    public String getFormula() {
        waitForTextToBePresent(txtFormular, txtFormular.getText());
        return txtFormular.getText();
    }

    public String getResultReview() {
        waitForTextToBePresent(txtResultReview, txtResultReview.getText());
        return txtResultReview.getText();
    }

    public String getResultFinal() {
        waitForTextToBePresent(txtResultFinal, txtResultFinal.getText());
        return txtResultFinal.getText();
    }
}
