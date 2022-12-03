package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class LogTest extends BaseTest {
    HomePage home;
    LoginPage log;

    @Test
    public void NavigateToLog(){
        home = new HomePage(driver);
        home.setLoginBtn();
    }
    @Test
    public void UserCanLogin(){
        log = new LoginPage(driver);
        log.setEmailTxt("mahmoud111@gmail.com");
        log.setPasswordTxt("m01205456797");
        log.setLogBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(log.setAssertionMessage(),"MAHMOUD");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        log.setUserMenu();
        log.setLogoutBtn();
    }
}
