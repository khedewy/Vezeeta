package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TopOffersPage extends PageBase{
    public TopOffersPage(WebDriver driver) {
        super(driver);
    }

    private final By teethCleaning = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/object/span[1]/div/a/h3");
    private final By teethAssertion = By.xpath("//*[@id=\"offerName-0\"]");
    private final By facialCleansing = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/object/span[2]/div/a/h3");
    private final By facialAssertion = By.xpath("//*[@id=\"offerName-0\"]");
    private final By metalBraces = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/object/span[3]/div/a/h3");
    private final By metalAssertion = By.xpath("//*[@id=\"offerName-0\"]");
    public void setTeethCleaning(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(teethCleaning)));
        driver.findElement(teethCleaning).click();
    }
    public String setTeethAssertion(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(teethAssertion)));
        return driver.findElement(teethAssertion).getText();
    }
    public void setFacialCleansing(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(facialCleansing)));
        driver.findElement(facialCleansing).click();
    }
    public String setFacialAssertion(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(facialAssertion)));
        return driver.findElement(facialAssertion).getText();
    }

    public void setMetalBraces(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(metalBraces)));
        driver.findElement(metalBraces).click();
    }
    public String setMetalAssertion(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(metalAssertion)));
        return driver.findElement(metalAssertion).getText();
    }

}
