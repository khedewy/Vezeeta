package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EcxuteJavScripts;
import pages.TopSpecialistPage;

import java.time.Duration;

public class TopSpecialistTest extends BaseTest {
    TopSpecialistPage Top;
    EcxuteJavScripts execute;
    @Test
    public void brainTest(){
        execute = new EcxuteJavScripts(driver);
        execute.executeScrollDownBy1800();
        Top = new TopSpecialistPage(driver);
        Top.setNavigateToNextPage();
        Top.setBrain();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(Top.setBrainAssertion(),"Neurology");
        driver.navigate().back();
    }

    @Test(priority = 1,dependsOnMethods = "brainTest")
    public void earsAndThroatTest(){
        Top = new TopSpecialistPage(driver);
        Top.setNavigateToNextPage();
        Top.setEarsAndThroat();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(Top.setEarsAssertion(),"Ear, Nose and Throat");
        driver.navigate().back();
    }
    @Test(priority = 2,dependsOnMethods = "earsAndThroatTest")
    public void childTest(){
        Top = new TopSpecialistPage(driver);
        Top.setChild();
        Assert.assertEquals(Top.setChildAssertion(),"Pediatrics and New Born");
    }
}
