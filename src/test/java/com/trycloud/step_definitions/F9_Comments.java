package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;

import com.trycloud.pages.TryCloudLogin;
import com.trycloud.utilities.BrowserUtils;

import com.trycloud.pages.HomePage;

import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class F9_Comments {


    TryCloudLogin tryCloudLogin = new TryCloudLogin();

    FilesPage filesPage = new FilesPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("user clicks the Files module")
    public void user_clicks_the_files_module() {

        tryCloudLogin.loginBy("User21","Userpass123");
        filesPage.filesTab.click();

     //   filesPage.files.click();  // ----------> I couldn't be sure about the part if duplicated action with "filesPage.filesTab.click();" or new locator. Please check 

    }

    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

        BrowserUtils.sleep(3);
        BrowserUtils.hover(filesPage.bmwFile);
        actions.contextClick(filesPage.bmwFile).perform();

    }

    @When("user choose the Details option")
    public void user_choose_the_details_option() {

        BrowserUtils.sleep(3);
        BrowserUtils.hover(filesPage.detailsOption);

        filesPage.detailsOption.click();
    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {

        BrowserUtils.sleep(3);
        filesPage.commentsOption.click();
        BrowserUtils.sleep(3);
        filesPage.messageInputBox.sendKeys("message");


    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {

        BrowserUtils.sleep(3);

        filesPage.submitMessageButton.click();
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

        Assert.assertTrue(filesPage.displayedMessage.isDisplayed());

    }
}
