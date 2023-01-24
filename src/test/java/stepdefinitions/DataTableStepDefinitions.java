package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class DataTableStepDefinitions {

    DataTablesPage dataTablesPage=new DataTablesPage();
    @Given("user is on {string} page")
    public void user_is_on_the_page(String string) {
        Driver.getDriver().get(string);
    }
    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        dataTablesPage.btnNew.click();
    }
    @Given("user enters the first name {string}")
    public void user_enters_the_first_name(String string) {
        dataTablesPage.inputFirstName.sendKeys(string);
    }
    @Given("user enters the last name {string}")
    public void user_enters_the_last_name(String string) {
        dataTablesPage.inputLastName.sendKeys(string);
    }
    @Given("user enters the position {string}")
    public void user_enters_the_position(String string) {
        dataTablesPage.inputPosition.sendKeys(string);
    }
    @Given("user enters the office {string}")
    public void user_enters_the_office(String string) {
        dataTablesPage.inputOffice.sendKeys(string);
    }
    @Given("user enters the extention {string}")
    public void user_enters_the_extention(String string) {
        dataTablesPage.inputExtention.sendKeys(string);
    }
    @Given("user enters the start date {string}")
    public void user_enters_the_start_date(String string) {
        dataTablesPage.inputStartDate.sendKeys(string);
    }
    @Given("user enters the salary {string}")
    public void user_enters_the_salary(String string) {
        dataTablesPage.inputSalary.sendKeys(string);
    }
    @Given("click on create button")
    public void click_on_create_button() {
        dataTablesPage.btnCreate.click();
    }
    @Given("search for the first name {string}")
    public void search_for_the_first_name(String string) {
        ReusableMethods.waitFor(2);
        dataTablesPage.inputSearchBox.sendKeys(string);

    }
    @Then("Verify the name field contains the first name {string}")
    public void verify_the_name_field_contains_the_first_name(String string) {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(dataTablesPage.nameColumn.getText().contains(dataTablesPage.inputSearchBox.getText()));
    }

    @Then("close the blue rental cars application")
    public void close_the_blue_rental_cars_application() {
        Driver.wait2(3);
        Driver.closeDriver();
    }
}
