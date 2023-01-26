package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/blue-rental-cars-login-test-reports.html"
        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        dryRun = false,
        tags="@failed_test"
)
public class FailedTestRunner {
}
