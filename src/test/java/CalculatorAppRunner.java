import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorAppRunner extends Config {

    @Test(priority = 1, description = "Calculate Two Numbers Summation")
    public void doSum()  {
        //create object
        CalculatorApp calculatorApp = new CalculatorApp(driver);
        //call method
        int actualValue = Integer.parseInt(calculatorApp.doSum(5, 7));
        int expectedResult = 12;
        //assertion
        Assert.assertEquals(actualValue, expectedResult);
    }

    @Test(priority = 2, description = "Calculate Two Number Subtraction")
    public void doSub()  {
        //create object
        CalculatorApp calculatorApp = new CalculatorApp(driver);
        //call method
        int actualValue = Integer.parseInt(calculatorApp.doSub(9, 2));
        int expectedResult = 7;
        //assertion
        Assert.assertEquals(actualValue, expectedResult);
    }

    @Test(priority = 3, description = "Calculate Two Number Multiply and Divide by 2")
    public void doMultiply()   {
        //create object
        CalculatorApp calculatorApp = new CalculatorApp(driver);
        //call method
        int actualValue = Integer.parseInt(calculatorApp.doMultiply(9, 2));
        int expectedResult = 9;
        //assertion
        Assert.assertEquals(actualValue, expectedResult);
    }

    @Test(priority = 4, description = "Do this calculation ex.100/10*5-10+60")
    public void doSeriesProblem1() {
        //create object
        CalculatorApp calculatorApp = new CalculatorApp(driver);
        //call method
        int actualValue = Integer.parseInt(calculatorApp.doSeriesProblem1());
        int expectedResult = 100;
        //assertion
        Assert.assertEquals(actualValue, expectedResult);
    }

    @Test(priority = 5, description = "Do this calculation ex.50+10-20*2+10/2")
    public void doSeriesProblem2() {
        //create object
        CalculatorApp calculatorApp = new CalculatorApp(driver);
        //call method
        int actualValue = Integer.parseInt(calculatorApp.doSeriesProblem2());
        int expectedResult = 25;
        //assertion
        Assert.assertEquals(actualValue, expectedResult);
    }
}
