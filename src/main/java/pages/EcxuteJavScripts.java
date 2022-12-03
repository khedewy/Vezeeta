package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class EcxuteJavScripts extends PageBase{
    public EcxuteJavScripts(WebDriver driver) {
        super(driver);
    }

    public void executeScrollDown(){
        js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1550)");
    }
    public void executeScrollDownBy1700(){
        js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1720)");
    }
    public void executeScrollDownBy1800(){
        js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1933)");
    }

}
