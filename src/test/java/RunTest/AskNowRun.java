package RunTest;

import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(features = {"src/test/java/Features/AskNow.feature"},glue = {"steps"})
public class AskNowRun extends BaseTest {
}
