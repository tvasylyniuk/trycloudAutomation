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

}
