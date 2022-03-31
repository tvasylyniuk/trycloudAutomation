package com.trycloud.pages;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage_Tatiana {

    public HomePage_Tatiana(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //=============== LOG IN PAGE ==============

    @FindBy(id = "user")
    public WebElement inputUserName;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    //=============== FILE MODULE ==============

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement filedTab;

    //=============== FILE PAGE ==============

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement fileActionBtn;

    //delete file dropdown option
    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li[starts-with(@class,' action')]")
    public List<WebElement> deleteFileDropdown;

    //deleted files dropdown option
    @FindBy(xpath = "//div[@id='app-navigation']//li")
    public List<WebElement> deletedFiles;

    //===============DELETED FILE PAGE ==============


}
