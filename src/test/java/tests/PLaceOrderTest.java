package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EcxuteJavScripts;
import pages.HomePage;
import pages.PlaceOrderPage;

import java.time.Duration;

public class PLaceOrderTest extends BaseTest {
    HomePage home;
    PlaceOrderPage placeOrder;
    EcxuteJavScripts execute;

    @Test
    public void goToPlaceOrderPage(){
        home = new HomePage(driver);
        execute = new EcxuteJavScripts(driver);
        execute.executeScrollDown();
        home.navigateToPlaceOrderPage();
    }
    @Test(priority = 1)
    public void OrderAnOrder(){
        placeOrder = new PlaceOrderPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        placeOrder.setSearchBox("panadol");
        placeOrder.setMedicine();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(placeOrder.setAssertionMessage(),"Panadol Extra 24 tablets");
    }
}
