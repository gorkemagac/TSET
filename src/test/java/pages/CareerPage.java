package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CareerPage extends BasePage{

    public CareerPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//p[.='Automation Test Engineer']/..//a")
    public WebElement automationTestEngineerLearnMoreButton;


}
