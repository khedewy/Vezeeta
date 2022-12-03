package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AskNowPage;
import pages.EcxuteJavScripts;
import pages.HomePage;
import pages.LoginPage;
import tests.BaseTest;

import java.time.Duration;

public class AskNowSteps extends BaseTest {
    HomePage home;
    AskNowPage ask;
    EcxuteJavScripts execute;
    LoginPage log;
    @Given("user scroll down to ask now and click ask now button")
    public void user_scroll_down_to_ask_now_and_click_ask_now_button() {
        home = new HomePage(driver);
        execute = new EcxuteJavScripts(driver);
        execute.executeScrollDown();
        home.setAskNow();
    }
    @When("User select the specialty from")
    public void user_select_the_specialty_from() {
        ask = new AskNowPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ask.setSpecialityDropDownList();
        ask.setSubFiled();
    }
    @When("User enter {string},{string},{string} and complete his information")
    public void user_enter_and_complete_his_information(String title, String question, String age) {
        ask = new AskNowPage(driver);
        ask.setTitleTXt(title);
        ask.setQuestionTxT(question);
        ask.setForMeOROthers();
        ask.setGenderBtn();
        ask.setAgeBox(age);
        execute.executeScrollDown();
        ask.setSubmitBtn();
    }
    @When("log by entering {string},{string} and click log in")
    public void log_by_entering_and_click_log_in(String email, String password) {
        log = new LoginPage(driver);
        log.setEmailTxt(email);
        log.setPasswordTxt(password);
        log.setLogBtn();
    }
    @Then("assert that the question is sent")
    public void assert_that_the_question_is_sent() {
        ask = new AskNowPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(ask.setAssertionMessage(),"The question was sent");
    }
}
