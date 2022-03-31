package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.HomePage;
import com.trycloud.pages.TryCloudLogin;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class s1_s2_Login {
    TryCloudLogin tryCloudLogin = new TryCloudLogin();
    HomePage homePage = new HomePage();

    @Given("user on the login page TryCloud")
    public void user_on_the_login_page() {

        System.out.println("You are on the  " + Driver.getDriver().getCurrentUrl() + "page");

    }

    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {

        tryCloudLogin.userInput.sendKeys(username+ Keys.ENTER);
        tryCloudLogin.passwordInput.sendKeys(password+ Keys.ENTER);
    }

    @When("user click the login button")
    public void user_click_the_login_button() {

        tryCloudLogin.submitFormInput.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

        String actual = homePage.dashboard.getText();
        String excual = "Dashboard";
        Assert.assertEquals(actual,excual,"user is not in dashboard");

    }

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {

        tryCloudLogin.userInput.sendKeys(username+ Keys.ENTER);
        tryCloudLogin.passwordInput.sendKeys(password+ Keys.ENTER);
    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String excualmessage) {
        String actualMessage = tryCloudLogin.warningMessage.getText();
        Assert.assertEquals(actualMessage,excualmessage);


    }
}
