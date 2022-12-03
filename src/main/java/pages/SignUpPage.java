package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage extends PageBase{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }
    private final By nameTxt = By.id("formik-input__input--fullName");
    private final By mobileNumberTxt = By.id("phoneNumber");
    private final By emailTxt = By.id("formik-input__input--email");
    private final By genderButton = By.id("formik-form__radio-button--female--selector");
    private final By BirthDateBox = By.id("date-input__input");
    private final By stepBack = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[3]/form/fieldset/div[5]/div/div/div[1]/button[2]");
    private final By yearOptions = By.cssSelector("button.react-calendar__tile:nth-child(1)");
    private final By monthsOptions = By.cssSelector("button.react-calendar__tile:nth-child(4) > abbr:nth-child(1)");
    private final By daysOptions = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[3]/form/fieldset/div[5]/div/div/div[2]/div/div/div/div[2]/button[25]/abbr");
    private final By joinButton = By.id("Generated_Button_ID_81");

    public void setNameTxt(String name){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(nameTxt)));
        driver.findElement(nameTxt).sendKeys(name);
    }
    public void setMobileNumberTxt(String mobile){
        driver.findElement(mobileNumberTxt).sendKeys(mobile);
    }
    public void setEmailTxt(String email){
        driver.findElement(emailTxt).sendKeys(email);
    }
    public void setGenderButton(){
        driver.findElement(genderButton).click();
    }
    public void setBirthDateBox(){
        driver.findElement(BirthDateBox).click();
    }
    public void setStepBack(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(stepBack)));
        driver.findElement(stepBack).click();
    }
    public void setYearOptions(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(yearOptions)));
        driver.findElement(yearOptions).click();
    }
    public void setMonthsOptions(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(monthsOptions)));
        driver.findElement(monthsOptions).click();
    }

    public void setDaysOptions(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(daysOptions)));
        driver.findElement(daysOptions).click();
    }
}
