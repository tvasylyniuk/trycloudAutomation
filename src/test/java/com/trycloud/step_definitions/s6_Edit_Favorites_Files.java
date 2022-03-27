package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage_ahmet;
import com.trycloud.pages.TryCloudLogin;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TryCloudUtils;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.trycloud.utilities.TryCloudUtils.favoritesList;
import static com.trycloud.utilities.TryCloudUtils.sideMenuButtons;


public class s6_Edit_Favorites_Files {

    TryCloudLogin tryCloudLogin = new TryCloudLogin();
    HomePage_ahmet homePage = new HomePage_ahmet();

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String headerBtn) {

        tryCloudLogin.loginBy();
        BrowserUtils.sleep(2);
        TryCloudUtils.headerButton(headerBtn);

    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {

        sideMenuButtons("Favorites");
        BrowserUtils.sleep(2);
        System.out.println(favoritesList());
        BrowserUtils.sleep(2);
        sideMenuButtons("All files");
        Actions actions = new Actions(Driver.getDriver());

        if (favoritesList().size() != 0) {
            for (WebElement file : homePage.allFilesTableList) {
                if (file.getText().equals(favoritesList().get(0))) {
                    actions.contextClick(file).perform();
                    homePage.firstElementInPopupAction.click();
                }
            }

        }

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

        Actions actions = new Actions(Driver.getDriver());

        if (favoritesList().size() != 0) {
            for (WebElement file : homePage.allFilesTableList) {
                if (file.getText().equals(favoritesList().get(0))) {
                    actions.contextClick(file).perform();
                    homePage.firstElementInPopupAction.click();
                }
            }

        }
    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
