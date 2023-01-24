package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleSearchStepDefinitions {

    GoogleHomePage googleHomePage=new GoogleHomePage();
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }

    @When("user search for iPhone")
    public void user_search_for_i_phone() {
        googleHomePage.searchInput.sendKeys("iPhone" + Keys.ENTER);

    }
    @Then("verify page title contains iPhone")
    public void verify_page_title_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));

    }
    @Then("close the application")
    public void close_the_application() {
        Driver.wait2(3);
        Driver.closeDriver();
    }

    @When("user search for TeaPot")
    public void user_search_for_tea_pot() {
        googleHomePage.searchInput.sendKeys("TeaPot" + Keys.ENTER);
    }
    @Then("verify page title contains TeaPot")
    public void verify_page_title_contains_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("TeaPot"));
    }

    @When("user search for {string} on google")
    public void user_search_for_on_google(String string) {
        googleHomePage.searchInput.sendKeys(string + Keys.ENTER);
    }
    @Then("verify page title contains {string}")
    public void verify_page_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

}
