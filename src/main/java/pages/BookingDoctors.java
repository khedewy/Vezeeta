package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookingDoctors extends PageBase{
    public BookingDoctors(WebDriver driver) {
        super(driver);
    }

    private final By speciality = By.id("selectSpecialityDropdown");
    private final By dentist = By.xpath("/html/body/div/div/div[1]/div[1]/span/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div[2]/span/ul/li[2]");
    private final By city = By.id("selectCityyDropdown");
    private final By Cairo = By.xpath("/html/body/div/div/div[1]/div[1]/span/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/span/ul/li[2]");
    private final By area = By.id("selectAreaDropdown");
    private final By newCairo = By.xpath("/html/body/div/div/div[1]/div[1]/span/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/span/ul/li[4]");
    private final By searchButton = By.xpath("/html/body/div/div/div[1]/div[1]/span/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/span");
    private final By searchBox = By.xpath("/html/body/div/div/div[1]/div[1]/span/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[4]/button/span[2]/input");
    private final By assertionMessage = By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[1]/h2");

    public void setSpeciality(){
        driver.findElement(speciality).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(dentist)));
        driver.findElement(dentist).click();
    }

    public void setCity(){
        driver.findElement(city).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Cairo)));
        driver.findElement(Cairo).click();
    }

    public void setArea(){
        driver.findElement(area).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(newCairo)));
        driver.findElement(newCairo).click();
    }

    public void setSearchButton(){
        driver.findElement(searchButton).click();
    }

    public void searchByName(String  name){
        driver.findElement(searchBox).click();
        driver.findElement(searchBox).sendKeys(name);
    }

    public String setAssertionMessage(){
        return driver.findElement(assertionMessage).getText();
    }
}
