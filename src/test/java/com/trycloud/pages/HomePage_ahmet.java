package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

// http://qa3.trycloud.net/index.php/apps/files/?dir=/&fileid=1403

public class HomePage_ahmet {
    public HomePage_ahmet() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = ".svg.active")
    public WebElement allFilesBtn;

    @FindBy(css = ".nav-icon-recent")
    public WebElement recenetBtn;

    @FindBy(css = ".nav-icon-favorites")
    public WebElement favoritesBtn;

    @FindBy(xpath = "//a[text()='Shares']")
    public WebElement sharesBtn;

    @FindBy(xpath = "//a[text()='Tags']")
    public WebElement tagsBtn;

    @FindBy(css = ".nav-icon-circlesfilter")
    public WebElement sharedToCirclesBtn;

    @FindBy(css = ".new")
    public WebElement newPlusBtn;

    @FindBy(css = ".icon-home")
    public WebElement iconhomeLink;

    // under "Files" module
    // "All files" module > checkbox
    //---------------------------------------------

    @FindBy(xpath = "//table[@class='list-container']/tbody/tr/td[1]/a/span[1]/span[1]")
    public List<WebElement> listOfFavTable;

    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[1]/a/span[2]")
    public WebElement firstElementInPopupAction;

    @FindBy(css = ".fileactions")
    public List<WebElement> action_icons;

    @FindBy(xpath = "(//a[@class='actions-selected']//span[.='Actions'])[1]")
    public WebElement actionsBtn_after_selected;

    @FindBy(xpath = "//tbody[@id='fileList']/tr/td[@class='selection']")
    public WebElement firstCheckBoxItem;

    @FindBy(xpath = "//table[@class='list-container  has-controls']/tbody/tr/td[2]/a/span/span[1]")
    public List<WebElement> allFilesTableList;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFileBtn;





}