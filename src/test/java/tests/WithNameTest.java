package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookingDoctors;

import java.time.Duration;

public class WithNameTest extends BaseTest {
    BookingDoctors book;

    @Test
    public void BookingDoctorsByName(){
        book = new BookingDoctors(driver);
        book.searchByName("Ahmed");
        book.setSearchButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(book.setAssertionMessage(),"2148 Doctors");
    }
}
