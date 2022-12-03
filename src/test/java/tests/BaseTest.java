package tests;

import com.google.common.io.Files;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class BaseTest extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void setDriver(@Optional("firefox") String browserName){
        if (browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.vezeeta.com/en");
        }
        else if (browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.vezeeta.com/en");
        }
    }

    @AfterTest
    public void setCloseDriver(){
        driver.close();
    }

    @AfterMethod
    public void takeScreenShoots(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
            Files.move(file,new File("resources/Screenshots"+result.getName()+".png"));

        }
    }
}
