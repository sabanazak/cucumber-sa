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
        monochrome=true,
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,
        tags="@blue_rental_cars"
)
public class RunnerForRentalCars {
}
