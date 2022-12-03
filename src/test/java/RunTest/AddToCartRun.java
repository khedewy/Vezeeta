package RunTest;

import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(features = "src/test/java/Features/addToCart.feature",glue = {"steps"})
public class AddToCartRun extends BaseTest {
}
