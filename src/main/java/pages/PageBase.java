package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageBase {
    protected WebDriver driver;
    JavascriptExecutor js;
    public PageBase(WebDriver driver){
        this.driver = driver;
    }
}
