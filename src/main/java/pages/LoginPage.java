package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By emailTxt = By.id("formik-input__input--email");
    private final By passwordTxt = By.id("formik-input__input--password");
    private final By logBtn = By.cssSelector("button.Buttonstyle__ButtonStyle-sc-19jncun-0.jRJzEY");
    private final By assertionMessage = By.cssSelector(".ActiveUserWidgetstyle__Trigger-sc-1j8nb09-1");
    private final By UserMenu = By.id("UserWidgetMenuTrigger");
    private final By logoutBtn = By.cssSelector("div.ContextMenustyle__Option-sc-grtfkz-0:nth-child(4) > span:nth-child(2)");
    private final By errorMessage = By.cssSelector(".Commonstyle__Error-sc-1vgucvm-0");

    public void setEmailTxt(String email){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(emailTxt)));
        driver.findElement(emailTxt).sendKeys(email);
    }
    public void setPasswordTxt(String password){
        driver.findElement(passwordTxt).sendKeys(password);
    }
    public void setLogBtn(){
        driver.findElement(logBtn).click();
    }
    public void setUserMenu(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(UserMenu)));
        driver.findElement(UserMenu).click();
    }
    public void setLogoutBtn(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(logoutBtn)));
        driver.findElement(logoutBtn).click();
    }
    public String setAssertionMessage(){
        return driver.findElement(assertionMessage).getText();
    }
    public String setErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}
