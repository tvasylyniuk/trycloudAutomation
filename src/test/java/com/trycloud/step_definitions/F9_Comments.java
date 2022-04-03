package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.HomePage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class F9_Comments {

    FilesPage filesPage = new FilesPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("user clicks the Files module")
    public void user_clicks_the_files_module() {
        filesPage.files.click();
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        actions.moveToElement(filesPage.file2jpg).perform();
        actions.contextClick(filesPage.file2jpg).perform();
    }
    @When("user choose the Details option")
    public void user_choose_the_details_option() {
        filesPage.detailsOption.click();
    }
    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        filesPage.inputMessageBox.sendKeys("comment");
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.submitMessageButton.click();
    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        Assert.assertTrue(filesPage.displayMessage.isDisplayed());
    }
}
