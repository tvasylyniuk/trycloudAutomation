package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.TryCloudLogin;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class F13_contact_list {

    HomePage homePage=new HomePage();
    TryCloudLogin tryCloudLogin=new TryCloudLogin();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
       tryCloudLogin.loginBy();
    }

    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        homePage.contacts.click();
    }

    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {
        List<WebElement> allContactNames=homePage.allContactNames;
        BrowserUtils.sleep(2);
        Assert.assertTrue(allContactNames.size()>=2);
    }

}
