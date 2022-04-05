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

    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement filesTab;

    @FindBy(css = "label[for='select_all_files']")
    public WebElement leftCheckbox;

    @FindBy(xpath = "//tbody//td[@class='selection']")
    public WebElement checkBoxes;


    @FindBy(xpath = "(//span[.='Specifications_BMW_i3_(120_Ah)_BMW_i3s_(120_Ah)#280918'])[2]")
    public WebElement bmwFile;

    //@FindBy(xpath = "//a[@class='menu-option option-details']")
    //public WebElement detailsOption;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentsOption;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement messageInputBox;

   // @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
   // public WebElement submitMessageButton;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement displayedMessage;


}
