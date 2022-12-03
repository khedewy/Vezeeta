package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ContactUsPage;
import pages.EcxuteJavScripts;
import pages.HomePage;
import tests.BaseTest;

import java.time.Duration;

public class ContactUsSteps extends BaseTest {

    HomePage home;
    ContactUsPage contact;
    EcxuteJavScripts execute;
    @Given("user in the home page and click on contact us button")
    public void user_in_the_home_page_and_click_on_contact_us_button() {
        home = new HomePage(driver);
        home.setContactUs();
    }
    @When("user enter his {string},{string},{string},{string}, amd click sendComment")
    public void user_enter_his_amd_click_send_comment(String name, String phone, String email, String comment) {
        contact = new ContactUsPage(driver);
        contact.setNameTxt(name);
        contact.setPhoneTxt(phone);
        contact.setEmailTxt(email);
        contact.setCommentBox(comment);
        contact.setSendCommentBtn();
    }
    @Then("assert that the user used the service successfully")
    public void assert_that_the_user_used_the_service_successfully() {
        contact = new ContactUsPage(driver);
        execute = new EcxuteJavScripts(driver);
        execute.executeScrollDown();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(contact.setAssertionMessage(),"Select a specialty\n" +
                "Choose specialty");
    }

}
