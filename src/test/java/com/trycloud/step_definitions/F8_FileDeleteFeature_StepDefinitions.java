package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage_Tatiana;
import com.trycloud.pages.TryCloudLogin;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class F8_FileDeleteFeature_StepDefinitions {

    HomePage_Tatiana homePage_tatiana = new HomePage_Tatiana();

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        homePage_tatiana.inputUserName.sendKeys(ConfigurationReader.getProperty("username1"));
        homePage_tatiana.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        homePage_tatiana.loginBtn.click();
    }

    @When("user clicks the {string} module")
    public void user_clicks_the_module(String fileModule) {
        homePage_tatiana.filedTab.click();
    }

    @When("user clicks action-icon from any file on the page")
    public void user_clicks_action_icon_from_any_file_on_the_page() {
        homePage_tatiana.fileActionBtn.click();
    }

    @When("user chooses {string} option")
    public void user_chooses_option(String deleteFile) {
        //looping through the dropdown and select Delete file option
        for (WebElement eachWebElement : homePage_tatiana.deleteFileDropdown) {
            if(eachWebElement.getText().equals(deleteFile)){
                eachWebElement.click();
            }
        }
    }

    @When("user clicks the {string} sub-module on the left side")
    public void user_clicks_the_sub_module_on_the_left_side(String string) {
        //iterating through the dropdown to select Deleted files
        for (WebElement eachWebElement : homePage_tatiana.deletedFiles) {
            if(eachWebElement.getText().equals(string)){
                eachWebElement.click();
            }
        }
    }

    @Then("Verify the deleted file is displayed on the page")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        homePage_tatiana.deletedFileOrder.click();
        homePage_tatiana.deletedFileOrder.click();
        Assert.assertTrue(homePage_tatiana.fileRow.isDisplayed());
    }
}
