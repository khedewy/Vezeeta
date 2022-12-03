package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By signUpButton = By.id("Header_button_link_Sign Up--false");
    private final By contactUsButton = By.id("Header_nav_link_Contact Us--false");
    private final By askNowButton = By.linkText("Ask now");
    private final By loginBtn = By.linkText("Login");
    private final By placeOrderBtn = By.cssSelector("div.NewSolutionsstyle__BannerCallToAction-sc-k98jre-16.boDOXc");

    public SignUpPage navigateToSignUpPage(){
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public ContactUsPage setContactUs(){
        driver.findElement(contactUsButton).click();
        return new ContactUsPage(driver);
    }

    public LoginPage setLoginBtn(){
        driver.findElement(loginBtn).click();
        return new LoginPage(driver);
    }

    public AskNowPage setAskNow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(askNowButton)));
        driver.findElement(askNowButton).click();
        return new AskNowPage(driver);
    }

    public PlaceOrderPage navigateToPlaceOrderPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(placeOrderBtn)));
        driver.findElement(placeOrderBtn).click();
        return new PlaceOrderPage(driver);
    }
}
