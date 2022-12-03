package RunTest;

import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(features = {"src/test/java/Features/Login.feature"},glue = {"steps"})
public class LoginRun extends BaseTest {
}
