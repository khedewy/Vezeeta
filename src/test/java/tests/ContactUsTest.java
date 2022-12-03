package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.EcxuteJavScripts;
import pages.HomePage;


import java.time.Duration;

public class ContactUsTest extends BaseTest {
    HomePage home;
    ContactUsPage contact;
    EcxuteJavScripts execute;

    @Test
    public void navigateToContactUs(){
        home = new HomePage(driver);
        home.setContactUs();
    }

    @Test(priority = 1)
    public void testContactUs(){
        contact = new ContactUsPage(driver);
        contact.setNameTxt("mahmoud");
        contact.setPhoneTxt("01203445677");
        contact.setEmailTxt("mmmqw@gmail.com");
        contact.setCommentBox("this nothing but a test automation project");
        contact.setSendCommentBtn();
        execute = new EcxuteJavScripts(driver);
        execute.executeScrollDown();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(contact.setAssertionMessage(),"Select a specialty\n" +
                "Choose specialty");
    }
}
