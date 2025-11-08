package com.tanphat;

import com.tanphat.base.BaseTest;
import com.tanphat.pages.CalculatorPage;
import com.tanphat.testSteps.CalculatorTestSteps;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest {
    @Test(dataProvider = "basicOperations")
    public void verifyBasicOperations(int firstNum, String operation, int secondNum, String expectedResult) {
        CalculatorPage calculator = new CalculatorPage(getDriver());
        CalculatorTestSteps step = new CalculatorTestSteps(calculator);

        step.enterFirstNumber(firstNum);
        step.performOperation(operation);
        step.enterSecondNumber(secondNum);
        step.pressEquals();

        Assert.assertTrue(step.verifyResult(expectedResult),
                String.format("[%s] Expected: %s, but result was different.", operation, expectedResult));

        step.clearCalculator();


    }

    @DataProvider
    public Object[][] basicOperations() {
        return new Object[][]{
                {2, "add", 3, "5"},
                {10, "subtract", 4, "6"},
                {3, "multiply", 7, "21"},
                {9, "divide", 3, "3"},
                {200, "percent", 10, "20"}
        };
    }
}
