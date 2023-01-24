package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {
    public DataTablesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='New']")
    public WebElement btnNew;

    @FindBy(id="DTE_Field_first_name")
    public WebElement inputFirstName;

    @FindBy(id="DTE_Field_last_name")
    public WebElement inputLastName;

    @FindBy(id="DTE_Field_position")
    public WebElement inputPosition;

    @FindBy(id="DTE_Field_office")
    public WebElement inputOffice;

    @FindBy(id="DTE_Field_extn")
    public WebElement inputExtention;

    @FindBy(id="DTE_Field_start_date")
    public WebElement inputStartDate;

    @FindBy(id="DTE_Field_salary")
    public WebElement inputSalary;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement btnCreate;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement inputSearchBox;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement nameColumn;
}
