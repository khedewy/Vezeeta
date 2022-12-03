package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

public class RegisterTest extends BaseTest {
    HomePage home;
    SignUpPage sign;

    @Test
    public void UserNavigationToSignUP() throws InterruptedException {
        home = new HomePage(driver);
        home.navigateToSignUpPage();

    }

    @Test
    public void UserCanRegister(){
        sign = new SignUpPage(driver);
        sign.setNameTxt("mahmoud");
        sign.setMobileNumberTxt("01205456789");
        sign.setEmailTxt("mmm123@gmial.com");
        sign.setGenderButton();
        sign.setBirthDateBox();
        sign.setStepBack();
        sign.setStepBack();
        sign.setYearOptions();
        sign.setMonthsOptions();
        sign.setDaysOptions();
    }
}
