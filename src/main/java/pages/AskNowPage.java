package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AskNowPage extends PageBase{
    public AskNowPage(WebDriver driver) {
        super(driver);
    }
    private final By specialityDropDownList = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/div/div[1]/form/div[1]/div/div");
    private final By subFiled = By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[2]/div/div[1]/form/div[1]/div/div/div/div[3]/h3/div[1]/div");
    private final By titleTXt = By.id("formik-input__input--title");
    private final By questionTxT = By.id("formik-input__input--description");
    private final By forMeOROthers = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/div/div[1]/form/div[7]/div[2]/div/div/div[2]/div/span");
    private final By genderBtn = By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/div/div[1]/form/div[9]/div[2]/div/div/div[1]/div");
    private final By ageBox = By.id("formik-input__input--age");
    private final By submitBtn = By.cssSelector("button.Buttonstyle__ButtonStyle-sc-19jncun-0.eJACsg");
    private final By assertionMessage = By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[1]/h1");

    public void setSpecialityDropDownList(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(specialityDropDownList)));
        driver.findElement(specialityDropDownList).click();
    }
    public void setSubFiled(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(subFiled)));
        driver.findElement(subFiled).click();
    }

    public void setTitleTXt(String title){
        driver.findElement(titleTXt).sendKeys(title);
    }
    public void setQuestionTxT(String question){
        driver.findElement(questionTxT).sendKeys(question);
    }
    public void setForMeOROthers(){
        driver.findElement(forMeOROthers).click();
    }
    public void setGenderBtn(){
        driver.findElement(genderBtn).click();
    }
    public void setAgeBox(String age){
        driver.findElement(ageBox).sendKeys(age);
    }
    public void setSubmitBtn(){
        driver.findElement(submitBtn).click();
    }
    public String setAssertionMessage(){
        return driver.findElement(assertionMessage).getText();
    }

}
