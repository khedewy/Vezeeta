package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsPage extends PageBase{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    private final By nameTxt = By.id("formik-input__input--fullName");
    private final By phoneTxt = By.id("phoneNumber");
    private final By emailTxt = By.id("formik-input__input--email");
    private final By commentBox = By.id("formik-input__input--comment");
    private final By sendCommentBtn = By.cssSelector("button.Buttonstyle__ButtonStyle-sc-19jncun-0.cbFMBr");
    private final By assertionMessage = By.id("selectSpecialityDropdown");



    public void setNameTxt(String name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(nameTxt)));
        driver.findElement(nameTxt).sendKeys(name);
    }
    public void setPhoneTxt(String phone){
        driver.findElement(phoneTxt).sendKeys(phone);
    }
    public void setEmailTxt(String email){
        driver.findElement(emailTxt).sendKeys(email);
    }
    public void setCommentBox(String comment){
        driver.findElement(commentBox).sendKeys(comment);
    }
    public void setSendCommentBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(sendCommentBtn)));
        driver.findElement(sendCommentBtn).click();
    }

    public String setAssertionMessage(){
        return driver.findElement(assertionMessage).getText();
    }
}
