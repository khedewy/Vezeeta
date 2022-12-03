package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChangeCountryPage;

public class ChangeCountryTest extends BaseTest {
    ChangeCountryPage change;

    @Test
    public void ChangeToSaudi(){
        change = new ChangeCountryPage(driver);
        change.setCurrentCountry();
        change.setSaudiArabia();
        Assert.assertEquals(change.setSaudiAssertion(),"920033402");
    }

    @Test(priority = 1,dependsOnMethods = "ChangeToSaudi")
    public void ChangeToJordan(){
        change = new ChangeCountryPage(driver);
        change.setCurrentCountry();
        change.setJordan();
        Assert.assertEquals(change.setJordanAssertion(),"Jordan");
    }
    @Test(priority = 2,dependsOnMethods = "ChangeToJordan")
    public void ChangeToNigeria(){
        change = new ChangeCountryPage(driver);
        change.setCurrentCountry();
        change.setNigeria();
        Assert.assertEquals(change.setNigeriaAssertion(),"Nigeria");
    }
}
