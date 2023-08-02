package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {
    public BasePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='narrow-arrow'])[1]/..")
    public WebElement getInTouchButton;

    @FindBy(xpath = "//input[@name='First Name']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='Last Name']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@name='Email Address']")
    public WebElement emailAddressTextBox;

    @FindBy(xpath = "//input[@name='Phone Number']")
    public WebElement phoneNumberTextBox;

    @FindBy(xpath = "//input[@name='Job Title']")
    public WebElement jobTitleTextBox;

    @FindBy(xpath = "//input[@name='Company']")
    public WebElement companyTextBox;

    @FindBy(xpath = "//input[@name='Country']")
    public WebElement countryTextBox;

    @FindBy(xpath = "(//button[@class='button'])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "(//a[@href='/career/'])[1]")
    public WebElement careerButtonButton;


}