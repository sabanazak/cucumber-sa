package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RentalCarsHomePage {
    public RentalCarsHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Login")
    public WebElement homePageLoginLink;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//button[@class='ajs-button ajs-ok']")
    public WebElement logoutMessageOkButton;

}
