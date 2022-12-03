package RunTest;

import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(features = {"src/test/java/Features/ChangeCountry.feature"},glue = {"steps"})
public class ChangeCountryRun extends BaseTest {
}
