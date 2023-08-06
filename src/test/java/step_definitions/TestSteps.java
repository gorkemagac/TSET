package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import pages.CareerPage;
import pages.TsetInSoftwarePage;
import utilities.Driver;

import java.util.Set;

public class TestSteps {

    BasePage basePage = new BasePage();
    CareerPage careerPage = new CareerPage();
    TsetInSoftwarePage tsetInSoftwarePage = new TsetInSoftwarePage();
    boolean sendButton;
    @When("user clicks Get in touch button")
    public void user_clicks_get_in_touch_button(){
        basePage.getInTouchButton.click();
    }
    @When("enters First Name, Last Name, Email Address, Phone Number, Job Title, Company and Country")
    public void enters_first_name_last_name_email_address_phone_number_job_title_company_and_country() {
        basePage.firstNameTextBox.sendKeys("Gorkem");
        basePage.lastNameTextBox.sendKeys("Agac");
        basePage.emailAddressTextBox.sendKeys("gorkem_agac@hotmail.com");
        basePage.phoneNumberTextBox.sendKeys("+351939129206");
        basePage.jobTitleTextBox.sendKeys("SDET");
        basePage.companyTextBox.sendKeys("Agac Limited");
        basePage.countryTextBox.sendKeys("Portugal");
    }
    @When("clicks Send button")
    public void clicks_send_button() {
        sendButton = basePage.sendButton.isDisplayed();
    }
    @Then("request is sent")
    public void request_is_sent() {
        Assert.assertTrue(sendButton);
    }

    @When("user clicks CareerButton")
    public void user_clicks_career_button() {
        basePage.careerButtonButton.click();
    }
    @When("clicks Learn more button for Automation Test Engineer")
    public void clicks_learn_more_button_for_automation_test_engineer() {
        careerPage.automationTestEngineerLearnMoreButton.click();
    }
    @Then("Apply button is clickable")
    public void apply_button_is_clickable() {

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        String currentWindowHandle = Driver.getDriver().getWindowHandle();

        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                Driver.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
       boolean applyButton = tsetInSoftwarePage.applyButton.isDisplayed();
       Assert.assertTrue(applyButton);
    }
}
