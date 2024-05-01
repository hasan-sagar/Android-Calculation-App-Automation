import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Config {
    //call android driver to extend driver as inheritance
    AndroidDriver driver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //platform name
        desiredCapabilities.setCapability("platformName", "android");
        //platform version
        desiredCapabilities.setCapability("platformVersion", "13");
        //automation name
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        //app package
        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        //app activity
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        //app apk
        desiredCapabilities.setCapability("app", System.getProperty("user.dir")+"/src/test/resources/calculator.apk");

        //appium inspector url
        URL url = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(url, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

    @AfterTest
    public void closeApplication(){
        driver.quit();
    }
}
