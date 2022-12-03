package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AskNowPage;
import pages.EcxuteJavScripts;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class AskNowTest extends BaseTest {
    HomePage home;
    AskNowPage ask;
    EcxuteJavScripts execute;
    LoginPage log;



    @Test()
    public void navigateToAskNow(){
        home = new HomePage(driver);
        execute = new EcxuteJavScripts(driver);
        execute.executeScrollDown();
        home.setAskNow();
    }

    @Test(priority = 1)
    public void UserCanUseAskNow(){
        ask = new AskNowPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ask.setSpecialityDropDownList();
        ask.setSubFiled();
        ask.setTitleTXt("this is a test");
        ask.setQuestionTxT("this nothing except a test automation project");
        ask.setForMeOROthers();
        ask.setGenderBtn();
        ask.setAgeBox("21");
        execute.executeScrollDown();
        ask.setSubmitBtn();
    }
    @Test(priority = 2)
    public void UserCanLog(){
        log = new LoginPage(driver);
        log.setEmailTxt("mahmoud111@gmail.com");
        log.setPasswordTxt("m01205456797");
        log.setLogBtn();
        ask = new AskNowPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(ask.setAssertionMessage(),"The question was sent");
    }
}
