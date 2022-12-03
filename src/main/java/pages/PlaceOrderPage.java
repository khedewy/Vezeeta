package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaceOrderPage extends PageBase{
    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }
    private final By searchBox = By.xpath("//*[@id=\"search-input\"]");
    private final By medicine = By.xpath("/html/body/div/div/div[2]/div[1]/div/li[1]/div/div[1]");
    private final By assertionMessage = By.xpath("/html/body/div/div/div/div[1]/div[1]/div/div/div[2]/h1");
    private final By paracetamol = By.xpath("/html/body/div/div/div/div[1]/div/div/li[1]/div/div[1]/span/div");

    public void setSearchBox(String medicine){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchBox)));
        driver.findElement(searchBox).sendKeys(medicine);
    }
    public MedicineDetails setMedicine(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(medicine)));
        driver.findElement(medicine).click();
        return new MedicineDetails(driver);
    }
    public String setAssertionMessage(){
        return driver.findElement(assertionMessage).getText();
    }
    public void setParacetamol(){
        driver.findElement(paracetamol).click();
    }
}
