package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import tests.BaseTest;

import java.time.Duration;

public class LoginSteps extends BaseTest {
    HomePage home;
    LoginPage log;
    @Given("user in the home page and click login")
    public void user_in_the_home_page_and_click_login() {
        home = new HomePage(driver);
        home.setLoginBtn();
    }
    @When("user enter valid {string} ,{string} and click login")
    public void user_enter_valid_and_click_login(String email, String password) {
        log = new LoginPage(driver);
        log.setEmailTxt(email);
        log.setPasswordTxt(password);
        log.setLogBtn();
    }
    @When("assert that the user login successfully")
    public void assert_that_the_user_login_successfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(log.setAssertionMessage(),"MAHMOUD");
    }
    @Then("click logout")
    public void click_logout() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        log.setUserMenu();
        log.setLogoutBtn();
    }

    //second scenario
    @Given("user in the home page and click login Button")
    public void user_in_the_home_page_and_click_login_button() {
        home = new HomePage(driver);
        home.setLoginBtn();
    }
    @When("user enter invalid {string}, and valid {string} and click log")
    public void user_enter_invalid_and_valid_and_click_log(String email, String password) {
        log = new LoginPage(driver);
        log.setEmailTxt(email);
        log.setPasswordTxt(password);
        log.setLogBtn();
    }
    @Then("assert that the app shows error message")
    public void assert_that_the_app_shows_error_message() {
        log = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(log.setErrorMessage(),"Mobile number/Email or password is incorrect. please try again");
    }
}
