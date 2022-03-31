package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage_ahmet;
import com.trycloud.pages.TryCloudLogin;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TryCloudUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.trycloud.utilities.TryCloudUtils.*;


public class s6_EditUploadFiles {

    TryCloudLogin tryCloudLogin = new TryCloudLogin();
    HomePage_ahmet homePage = new HomePage_ahmet();
    String moveFirst;

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String headerBtn) {


        tryCloudLogin.loginBy();
        TryCloudUtils.headerButton(headerBtn);

    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {

        sideMenuButtons("Favorites");
        System.out.println(favoritesList());
        moveFirst = favoritesList().get(0);
        BrowserUtils.sleep(2);
        sideMenuButtons("All files");

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String popMenuItem) {

        Actions actions = new Actions(Driver.getDriver());
        for (WebElement file : homePage.allFilesTableList) {
            if (file.getText().equals(moveFirst)) {
                actions.contextClick(file).pause(2).perform();
                actions.click(Driver.getDriver().findElement
                        (By.xpath("(//span[.='" + popMenuItem + "'])[2]"))).perform();
            }
        }
    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String sideMenuItem) {
        sideMenuButtons(sideMenuItem);


    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        Assert.assertFalse(moveFirst + "item is still in the favorite list", favoritesList().contains(moveFirst));

    }


    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
        homePage.newPlusBtn.click();
        BrowserUtils.sleep(3);
    }

    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {


        String path = "C:\\Users\\oz_ah\\OneDrive\\Pictures\\Assurance.jpg";

        addMenuOpt(path);
        BrowserUtils.sleep(5);
        Driver.getDriver().navigate().refresh();

    }

    @Then("Verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
        String expectedItem = "istockphoto-1215248502-612x612";
        Assert.assertTrue(itemCheckInTheList(expectedItem));
        BrowserUtils.sleep(3);
    }

}
