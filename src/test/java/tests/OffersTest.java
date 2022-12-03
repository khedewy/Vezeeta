package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EcxuteJavScripts;
import pages.TopOffersPage;

public class OffersTest extends BaseTest {
    EcxuteJavScripts execute;
    TopOffersPage offers;

    @Test
    public void TestTeethOffers(){
        execute = new EcxuteJavScripts(driver);
        execute.executeScrollDownBy1700();
        offers = new TopOffersPage(driver);
        offers.setTeethCleaning();
        Assert.assertEquals(offers.setTeethAssertion(),"Scaling And Polishing");
        driver.navigate().back();
    }
    @Test(priority = 1,dependsOnMethods = "TestTeethOffers")
    public void faceTest(){
        offers = new TopOffersPage(driver);
        offers.setFacialCleansing();
        Assert.assertEquals(offers.setFacialAssertion(),"Facial cleansing");
        driver.navigate().back();
    }
    @Test(priority = 2,dependsOnMethods = "faceTest")
    public void metalTest(){
        offers = new TopOffersPage(driver);
        offers.setMetalBraces();
        Assert.assertEquals(offers.setMetalAssertion(),"Metal Braces for 1 Jaw");
        driver.navigate().back();
    }
}
