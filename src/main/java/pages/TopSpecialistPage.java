package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TopSpecialistPage extends PageBase{
    public TopSpecialistPage(WebDriver driver) {
        super(driver);
    }
    private final By NavigateToNextPage = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[3]/div[2]/div/div/div[3]");
    private final By Brain = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[3]/div[2]/div/div/div[2]/object/span[5]/a/h3");
    private final By brainAssertion = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[1]/h2");
    private final By EarsAndThroat = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[3]/div[2]/div/div/div[2]/object/span[8]/a/h3");
    private final By earsAssertion = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[1]/h2");
    private final By child = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[3]/div[2]/div/div/div[2]/object/span[4]/a/h3");
    private final By childAssertion = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[1]/h2");

    public void setNavigateToNextPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(NavigateToNextPage)));
        driver.findElement(NavigateToNextPage).click();
    }
    public void setBrain(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Brain)));
        driver.findElement(Brain).click();
    }
    public String setBrainAssertion(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(brainAssertion)));
        return driver.findElement(brainAssertion).getText();
    }
    public void setEarsAndThroat(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(EarsAndThroat)));
        driver.findElement(EarsAndThroat).click();
    }
    public String setEarsAssertion(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(earsAssertion)));
        return driver.findElement(earsAssertion).getText();
    }
    public void setChild(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(child)));
        driver.findElement(child).click();
    }
    public String setChildAssertion(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(childAssertion)));
        return driver.findElement(childAssertion).getText();
    }


}
