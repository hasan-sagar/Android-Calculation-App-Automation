import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorApp {

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement plusButton;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement minusButton;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement multiplyButton;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement divideButton;

    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement buttonEqual;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement result;


    AndroidDriver driver;

    public CalculatorApp(AndroidDriver driver) {
        //initialize driver to use in methods
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String doSum(int number1, int number2) {
        //params pass to calculator id
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + number1)).click();
        plusButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + number2)).click();
        buttonEqual.click();
        return result.getText();
    }

    public String doSub(int number1, int number2) {
        //params pass to calculator id
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + number1)).click();
        minusButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + number2)).click();
        buttonEqual.click();
        return result.getText();
    }

    public String doMultiply(int number1, int number2) {
        //params pass to calculator id
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + number1)).click();
        multiplyButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + number2)).click();
        divideButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + number2)).click();
        buttonEqual.click();
        return result.getText();
    }

    public String doSeriesProblem1() {
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        divideButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        multiplyButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
        minusButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        plusButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        buttonEqual.click();
        return result.getText();
    }

    public String doSeriesProblem2() {
        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        plusButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        minusButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        multiplyButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        plusButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        divideButton.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        buttonEqual.click();
        return result.getText();
    }
}
