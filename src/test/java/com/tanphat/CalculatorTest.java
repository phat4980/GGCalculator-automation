package com.tanphat;

import com.tanphat.base.BaseTest;
import com.tanphat.pages.CalculatorPage;
import com.tanphat.testSteps.CalculatorTestSteps;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest {
    @Test(dataProvider = "basicOperations")
    public void verifyBasicOperations(String operation, int firstNum, int secondNum, String expectedResult) {
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
                {"add", 2, 3, "5"},
                {"subtract", 10, 4, "6"},
                {"multiply", 3, 7, "21"},
                {"divide", 9, 3, "3"},
                {"percent", 200, 10, "20"}
        };
    }
}
