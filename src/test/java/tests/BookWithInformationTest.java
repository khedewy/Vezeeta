package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookingDoctors;

import java.time.Duration;

public class BookWithInformationTest extends BaseTest {
    BookingDoctors book;

    @Test
    public void UserCanBookAADoctor(){
        book = new BookingDoctors(driver);
        book.setSpeciality();
        book.setCity();
        book.setArea();
        book.setSearchButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(book.setAssertionMessage(),"Dentistry");
    }
}
