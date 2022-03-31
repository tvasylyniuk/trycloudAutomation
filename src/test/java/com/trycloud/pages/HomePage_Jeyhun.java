package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_Jeyhun extends BasePage {

    @FindBy(xpath = "(//div[@class='header-right']/div)[1]")
    public WebElement magnifierIcon;

@FindBy(xpath = "//input[@class=\"unified-search__form-input\"]")
    public WebElement searchBox;

@FindBy(xpath = "//*[@id=\"header-menu-unified-search\"]/div[2]/ul[1]/li[1]/a/span/h3/span/strong")
public WebElement searchedElement;
}
