package RunTest;

import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(features = {"src/test/java/Features/BookDoctor.feature"},glue = {"steps"})
public class BookDoctorRun extends BaseTest {
}
