package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{


    @FindBy(css = "#appmenu li[data-id='dashboard'] svg")
    public WebElement dashboard;

    @FindBy(css = "#appmenu li[data-id='files'] svg")
    public WebElement files;

    @FindBy(css = "#appmenu li[data-id='photos'] svg")
    public WebElement photos;

    @FindBy(css = "#appmenu li[data-id='activity'] svg")
    public WebElement activity;

    @FindBy(css = "#appmenu li[data-id='spreed'] svg")
    public WebElement talk;

    @FindBy(css = "#appmenu li[data-id='mail'] a")
    public WebElement mail;

    @FindBy(css = "#appmenu li[data-id='contacts'] svg")
    public WebElement contacts;

    @FindBy(css = "#appmenu li[data-id='circles'] a")
    public WebElement circles;

    @FindBy(css = "#appmenu li[data-id='calendar'] svg")
    public WebElement calendar;

    @FindBy(css = "#appmenu li[data-id='deck'] svg")
    public WebElement deck;

    @FindAll(
            @FindBy (xpath = "//div[@class='vue-recycle-scroller__item-view']"))
    public List<WebElement> allContactNames;

}
