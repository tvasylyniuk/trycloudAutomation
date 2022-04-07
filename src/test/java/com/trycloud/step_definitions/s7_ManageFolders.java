package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.TryCloudLogin;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class s7_ManageFolders {

    FilesPage filesPage = new FilesPage();
    TryCloudLogin tryCloudLogin = new TryCloudLogin();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user on the dashboard page*")
    public void user_on_the_dashboard_page() {
        tryCloudLogin.loginBy();
    }

    @When("the user clicks the {string} module*")
    public void the_user_clicks_the_module(String string) {
        filesPage.filesTab.click();
    }

    @When("user clicks the add icon on the top*")
    public void user_clicks_the_add_icon_on_the_top() {
        BrowserUtils.waitForClickablility(filesPage.addIcon, 3);
        filesPage.addIcon.click();
    }

    @When("user click \"new folder”*")
    public void user_click_new_folder() {
        BrowserUtils.waitForClickablility(filesPage.newFolderButton, 3);
        filesPage.newFolderButton.click();
    }

    @When("user write a folder name*")
    public void user_write_a_folder_name() {
        filesPage.newFolderInput.sendKeys("k-trycloud");
    }

    @When("the user click submit icon*")
    public void the_user_click_submit_icon() {
        filesPage.submitButton.click();
    }

    @Then("Verify the folder is displayed on the page*")
    public void verify_the_folder_is_displayed_on_the_page() {
        //BrowserUtils.waitForPageToLoad(7);
        BrowserUtils.sleep(5);
        Assert.assertTrue(filesPage.newFolderLocation.isDisplayed());
    }

    @When("user choose a folder from the page*")
    public void user_choose_a_folder_from_the_page() {
        BrowserUtils.waitForClickablility(filesPage.newFolderLocation, 5);
        filesPage.newFolderLocation.click();
    }

    @When("the user uploads a file with the upload file option*")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
        BrowserUtils.sleep(5);
        String pathOfObject = System.getProperty("user.dir");
        BrowserUtils.sleep(5);
        String path = pathOfObject+"/src/test/resources/files/k-este.jpg";
        filesPage.uploadButton.sendKeys(path);
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(filesPage.uploadFile, 5);
        filesPage.addIcon.click();
    }

    @Then("Verify the file is displayed on the page*")
    public void verify_the_file_is_displayed_on_the_page() {
        BrowserUtils.waitForVisibility(filesPage.uploadedFile, 5);
        Assert.assertTrue(filesPage.uploadedFile.isDisplayed());

        Driver.getDriver().navigate().back();
        BrowserUtils.waitForPageToLoad(5);
        filesPage.threeDotLocator.click();
        BrowserUtils.hover(filesPage.delete);
        filesPage.delete.click();

    }

}
