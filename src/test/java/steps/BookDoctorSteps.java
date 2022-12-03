package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BookingDoctors;
import tests.BaseTest;

import java.time.Duration;

public class BookDoctorSteps extends BaseTest {

    BookingDoctors book;
    @Given("User in the home page and choose the the speciality, city, area")
    public void user_in_the_home_page_and_choose_the_the_speciality_city_area() {
        book = new BookingDoctors(driver);
        book.setSpeciality();
        book.setCity();
        book.setArea();
    }
    @When("User click on search")
    public void user_click_on_search() {
        book = new BookingDoctors(driver);
        book.setSearchButton();
    }
    @Then("Assert that the search process is successfully completed")
    public void assert_that_the_search_process_is_successfully_completed() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(book.setAssertionMessage(),"Dentistry");
    }
}
