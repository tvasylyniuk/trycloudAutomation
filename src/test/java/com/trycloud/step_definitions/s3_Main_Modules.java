package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.TryCloudLogin;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class s3_Main_Modules  {

    HomePage homePage = new HomePage();
    TryCloudLogin tryCloudLogin = new TryCloudLogin();

    @Given("user on the login page")
    public void user_on_the_login_page() {

        System.out.println("User on the : "+ConfigurationReader.getProperty("env"));

    }

    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {

        tryCloudLogin.userInput.sendKeys(ConfigurationReader.getProperty("username1"));
        tryCloudLogin.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        tryCloudLogin.submitFormInput.click();

    }

    @Then("Verify the user see the following modules")
    public void verify_the_user_see_the_following_modules(List <String> mainModules) {

        System.out.println("User see the following modules :"+ mainModules);

    }
}

