package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.RentalCarsHomePage;
import pages.RentalCarsLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class BlueRentalCarsStepDefinations {
    RentalCarsHomePage homePage=new RentalCarsHomePage();
    RentalCarsLoginPage loginPage=new RentalCarsLoginPage();

    @Given("user is on the {string} page")
    public void user_is_on_the_page(String string) {
        Driver.getDriver().get(string);
    }
    @When("user navigates to the login page")
    public void user_navigates_to_the_login_page() {
        homePage.homePageLoginLink.click();
    }
    @When("enter username {string}")
    public void enter_username(String string) {
        loginPage.userName.sendKeys(string);
    }
    @When("enter password {string}")
    public void enter_password(String string) {
        loginPage.password.sendKeys(string);
    }
    @When("click on login button")
    public void click_on_login_button() {
        loginPage.loginButton.click();
    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage.userID.isDisplayed());
    }
    @Then("user logout")
    public void user_logout() {
        ReusableMethods.waitFor(2);
        homePage.userID.click();
        homePage.logoutButton.click();
        ReusableMethods.waitForVisibility(homePage.logoutMessageOkButton,5);
        homePage.logoutMessageOkButton.click();
    }
}
