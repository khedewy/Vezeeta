package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.EcxuteJavScripts;
import pages.HomePage;
import pages.MedicineDetails;
import pages.PlaceOrderPage;
import tests.BaseTest;

import java.time.Duration;

public class AddToCartSteps extends BaseTest {
    HomePage home;
    PlaceOrderPage placeOrder;
    EcxuteJavScripts execute;
    MedicineDetails medicine;

    @Given("User in the home page and scroll down then click place order")
    public void user_in_the_home_page_and_scroll_down_then_click_place_order() {
        home = new HomePage(driver);
        execute = new EcxuteJavScripts(driver);
        execute.executeScrollDown();
        home.navigateToPlaceOrderPage();
    }
    @When("User search {string} and choose the product")
    public void user_search_and_choose_the_product(String productName) {
        placeOrder = new PlaceOrderPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        placeOrder.setSearchBox(productName);
        placeOrder.setMedicine();
            }
    @When("user add the product to cart")
    public void user_add_the_product_to_cart() {
        medicine = new MedicineDetails(driver);
        medicine.addToCart();
        medicine.setViewCart();
    }
    @Then("user check that the item is added")
    public void user_check_that_the_item_is_added() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(medicine.setAssertionMessage(),"Number Of Items : 1");
    }
    @Then("user search {string} and choose the product")
    public void user_search_and_choose_the_product_again(String productName) {
        placeOrder = new PlaceOrderPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        placeOrder.setSearchBox(productName);
        placeOrder.setParacetamol();
    }
    @Then("user add the second product to the cart")
    public void user_add_the_second_product_to_the_cart() {
        medicine = new MedicineDetails(driver);
        medicine.addToCart();
        medicine.setViewCart();
    }
    @Then("user check that the cart contains tow items")
    public void user_check_that_the_cart_contains_tow_items() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(medicine.setAssertionMessage(),"Number Of Items : 2");
    }
}
