package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MedicineDetails extends PageBase{
    public MedicineDetails(WebDriver driver) {
        super(driver);
    }
    private final By addToCartBtn = By.cssSelector("button.AddToCartstyle__AddToCartButton-sc-8piz0p-0.jRLLzY");
    private final By viewCart = By.cssSelector("button.Productstyle__ViewCartButton-stlavj-17.bvYibX");
    private final By addToCartAssertion = By.xpath("/html/body/div/div/div/div[2]/div/div[2]");


    public void addToCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addToCartBtn)));
        driver.findElement(addToCartBtn).click();
    }
    public void setViewCart(){
        driver.findElement(viewCart).click();
    }
    public String setAssertionMessage(){
        return driver.findElement(addToCartAssertion).getText();
    }
}
