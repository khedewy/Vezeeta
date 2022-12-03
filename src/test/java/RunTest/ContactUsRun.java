package RunTest;

import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(features = {"src/test/java/Features/contactUs.feature"},glue = {"steps"})
public class ContactUsRun extends BaseTest {
}
