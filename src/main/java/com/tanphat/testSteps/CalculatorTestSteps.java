package com.tanphat.testSteps;

import com.tanphat.pages.CalculatorPage;
import io.qameta.allure.Step;

public class CalculatorTestSteps {

    private final CalculatorPage calculator;

    public CalculatorTestSteps(CalculatorPage calculator) {
        this.calculator = calculator;
    }

    @Step("Enter first number: {0}")
    public void enterFirstNumber(int num) {
        calculator.enterNumber(String.valueOf(num));
    }

    @Step("Enter second number: {0}")
    public void enterSecondNumber(int num) {
        calculator.enterNumber(String.valueOf(num));
    }

    @Step("Perform operation: {0}")
    public void performOperation(String operation) {
        switch (operation.toLowerCase()) {
            case "add"        -> calculator.add();
            case "subtract"   -> calculator.subtract();
            case "multiply"   -> calculator.multiply();
            case "divide"     -> calculator.divide();
            case "percent"    -> calculator.percent();
            default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    @Step("Press Equals")
    public void pressEquals() {
        calculator.equal();
    }

    @Step("Verify result is: {0}")
    public boolean verifyResult(String expectedResult) {
        String actualResult = calculator.getResultFinal().replace('−', '-').trim();
        return actualResult.equals(expectedResult);
    }

    @Step("Clear calculator")
    public void clearCalculator() {
        calculator.clear();
    }
}
