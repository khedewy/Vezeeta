package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ChangeCountryPage;
import tests.BaseTest;

public class ChangeCountrySteps extends BaseTest {
    ChangeCountryPage change;
    @Given("user in the home page and click on country dropDown items to select country")
    public void user_in_the_home_page_and_click_on_country_drop_down_items_to_select_country() {
        change = new ChangeCountryPage(driver);
        change.setCurrentCountry();
    }
    @When("user change to SaudiArabia")
    public void user_change_to_saudi_arabia() {
        change = new ChangeCountryPage(driver);
        change.setSaudiArabia();
    }
    @Then("user check that it changed to SaudiArabia")
    public void user_check_that_it_changed_to_saudi_arabia() {
        change = new ChangeCountryPage(driver);
        Assert.assertEquals(change.setSaudiAssertion(),"920033402");
    }
    @Given("user in the hom page and click to change country")
    public void user_in_the_hom_page_and_click_to_change_country() {
        change = new ChangeCountryPage(driver);
        change.setCurrentCountry();
    }
    @When("user change to Jordan")
    public void user_change_to_jordan() {
        change = new ChangeCountryPage(driver);
        change.setJordan();
    }
    @Then("assert that it changed to jordan")
    public void assert_that_it_changed_to_jordan() {
        change = new ChangeCountryPage(driver);
        Assert.assertEquals(change.setJordanAssertion(),"Jordan");
    }
    @Given("user in the home page and clicks on dropdown to select country")
    public void user_in_the_home_page_and_clicks_on_dropdown_to_select_country() {
        change = new ChangeCountryPage(driver);
        change.setCurrentCountry();
    }
    @When("usr change to Nigeria")
    public void usr_change_to_nigeria() {
        change = new ChangeCountryPage(driver);
        change.setNigeria();
    }
    @Then("assert that it changed to Nigeria")
    public void assert_that_it_changed_to_nigeria() {
        change = new ChangeCountryPage(driver);
        Assert.assertEquals(change.setNigeriaAssertion(),"Nigeria");
    }



}
