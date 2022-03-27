package com.trycloud.pages;

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

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMessage;

}
