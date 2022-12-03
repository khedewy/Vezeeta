package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChangeCountryPage extends PageBase{
    public ChangeCountryPage(WebDriver driver) {
        super(driver);
    }
    private final By currentCountry = By.cssSelector(("span.SelectCountrystyle__DropDownArrow-sc-1qkgat9-9.bBBbZc"));
    private final By SaudiArabia = By.xpath("/html/body/div/div/div[1]/div[1]/div/div[2]/div[2]/div/div/span[1]/ul/a[1]/li/span");
    private final By SaudiAssertion = By.xpath("/html/body/div/div/div[1]/div[1]/span/div/div[2]/span[1]/h2/span/a");
    private final By Jordan = By.xpath("/html/body/div/div/div[1]/div[1]/div/div[2]/div[2]/div/div/span[1]/ul/a[3]/li/span");
    private final By JordanAssertion = By.xpath("/html/body/div/div/div[1]/div[1]/div/div[2]/div[2]/div/div/button/span[1]");
    private final By Nigeria = By.xpath("/html/body/div/div/div[1]/div[1]/div/div[2]/div[2]/div/div/span[1]/ul/a[5]/li/span");
    private final By NigeriaAssertion = By.xpath("/html/body/div/div/div[1]/div[1]/div/div[2]/div[2]/div/div/button/span[1]");

    public void setCurrentCountry(){
        driver.findElement(currentCountry).click();
    }
    public void setSaudiArabia(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(SaudiArabia)));
        driver.findElement(SaudiArabia).click();
    }
    public String setSaudiAssertion(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(SaudiAssertion)));
        return driver.findElement(SaudiAssertion).getText();
    }
    public void setJordan(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Jordan)));
        driver.findElement(Jordan).click();
    }
    public String setJordanAssertion(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(JordanAssertion)));
        return driver.findElement(JordanAssertion).getText();
    }
    public void setNigeria(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Nigeria)));
        driver.findElement(Nigeria).click();
    }
    public String setNigeriaAssertion(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(NigeriaAssertion)));
        return driver.findElement(NigeriaAssertion).getText();
    }
}
