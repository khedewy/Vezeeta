package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EcxuteJavScripts;
import pages.HomePage;
import pages.MedicineDetails;
import pages.PlaceOrderPage;

import java.time.Duration;

public class AddToCartTest extends BaseTest {
    HomePage home;
    PlaceOrderPage placeOrder;
    EcxuteJavScripts execute;
    MedicineDetails medicine;

    @Test
    public void goToPlaceOrderPage(){
        home = new HomePage(driver);
        execute = new EcxuteJavScripts(driver);
        execute.executeScrollDownBy1700();
        home.navigateToPlaceOrderPage();
    }
    @Test(priority = 1)
    public void OrderAnOrder(){
        placeOrder = new PlaceOrderPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        placeOrder.setSearchBox("panadol");
        placeOrder.setMedicine();
    }
    @Test(priority = 2)
    public void UserAddToCart(){
        medicine = new MedicineDetails(driver);
        medicine.addToCart();
        medicine.setViewCart();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(medicine.setAssertionMessage(),"Number Of Items : 1");
    }
    @Test(priority = 3)
    public void searchItemsAgain(){
        placeOrder = new PlaceOrderPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        placeOrder.setSearchBox("para");
        placeOrder.setParacetamol();
    }
    @Test(priority = 4)
    public void UserAddToCartAgain(){
        medicine = new MedicineDetails(driver);
        medicine.addToCart();
        medicine.setViewCart();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(medicine.setAssertionMessage(),"Number Of Items : 2");
    }
}
