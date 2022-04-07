package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage {

    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement filesTab;

    @FindBy(css = "label[for='select_all_files']")
    public WebElement leftCheckbox;

    @FindBy(xpath = "//tbody//td[@class='selection']")
    public WebElement checkBoxes;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;

    @FindBy(xpath = "//span[text()='New folder']")
    public WebElement newFolderButton;

    @FindBy(id = "view13-input-folder")
    public WebElement newFolderInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submitButton;

    @FindBy(xpath = "//span[text()='k-trycloud']")
    public WebElement newFolderLocation;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]//span[.='k-este']")
    public WebElement uploadedFile;

    @FindBy(xpath = "//span[.='k-trycloud']/../following-sibling::span//span[@class='icon icon-more']/..")
    public WebElement threeDotLocator;

    @FindBy(xpath = "//span[text()='Upload file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//li[@class=' action-delete-container']")
    public WebElement delete;


}
