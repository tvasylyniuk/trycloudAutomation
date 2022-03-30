package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends HomePage{

    @FindBy(xpath = "(//div[@class='thumbnail'])[4]")
    public WebElement file2jpg;

    @FindBy(xpath = "(//span[.='Details'])[2]")
    public WebElement detailsOption;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentsTab;

    @FindBy(xpath = "(//div[@contenteditable='true'])[2]")
    public WebElement inputMessageBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitMessageButton;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement displayMessage;


}
