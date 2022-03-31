package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage_Jeyhun;
import com.trycloud.pages.TryCloudLogin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_14_MagnifierIcon {

   TryCloudLogin tryCloudLogin = new TryCloudLogin();
   HomePage_Jeyhun homePage_jeyhun = new HomePage_Jeyhun();


    @When("the user clicks the magnifier icon on the right top..")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
      tryCloudLogin.loginBy();
      homePage_jeyhun.magnifierIcon.click();
    }
    @When("users search any {string} existing file-folder-user name..")
    public void users_search_any_existing_file_folder_user_name(String string) {
        homePage_jeyhun.searchBox.sendKeys("Talk");
    }
    @Then("verify the {string} displays the expected result option..")
    public void verify_the_displays_the_expected_result_option(String string) {
     Assert.assertTrue(homePage_jeyhun.searchedElement.isDisplayed());

    }


}

