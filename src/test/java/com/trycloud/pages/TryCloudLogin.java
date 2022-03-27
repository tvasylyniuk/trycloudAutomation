package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryCloudLogin extends BasePage {


    @FindBy(id = "user")
    public WebElement userInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement submitFormInput;

    @FindBy(id = "lost-password")
    public WebElement lostpasswordLink;

    @FindBy(xpath = "//a[normalize-space(text()) = 'Log in with a device']")
    public WebElement elementLink;

    @FindBy(css = ".info")
    public WebElement infoP;

    // -------------------------------------------------------------


    public void loginBy(String username, String password) {
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitFormInput.click();
    }

    public void loginBy() {
        userInput.sendKeys(ConfigurationReader.getProperty("username1"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        submitFormInput.click();
    }

    public void loginBy(String submitType, String username, String password) {

        if (submitType.equals("submitType")) {
            userInput.sendKeys(username);
            passwordInput.sendKeys(password);
            submitFormInput.click();
        }

        if (submitType.equals("enter")) {
            userInput.sendKeys(username);
            passwordInput.sendKeys(password + Keys.ENTER);
        }


    }

}
