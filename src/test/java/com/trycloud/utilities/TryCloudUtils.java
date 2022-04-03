package com.trycloud.utilities;


import com.trycloud.pages.HomePage_ahmet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class TryCloudUtils {

    public static Actions actions = new Actions(Driver.getDriver());
    public static HomePage_ahmet homePage = new HomePage_ahmet();

    public static void headerButton(String head) {
        head = head.toLowerCase();
        String headLocator = "//ul[@id='appmenu']/li[@data-id='" + head + "']";

        BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath(headLocator)), 5);

        actions.moveToElement(Driver.getDriver().findElement(By.xpath(headLocator))).click().perform();

    }

    public static void sideMenuButtons(String sideBtn) {

        Driver.getDriver().findElement(By.linkText(sideBtn)).click();

    }

    public static List<String> favoritesList() {

        List<String> listOfFav = new ArrayList<>();
        homePage.listOfFavTable.forEach(p -> listOfFav.add(p.getText()));

        return listOfFav;
    }

    public static void addMenuOpt(String path) {
        BrowserUtils.waitForVisibility(homePage.uploadFileBtn, 5);
        actions.moveToElement(homePage.uploadFileBtn).sendKeys(path).perform();

    }

    public static boolean itemCheckInTheList(String itemName) {
        boolean result = false;
        List<String> listNames = new ArrayList<>();
        homePage.allFilesTableList.forEach(p -> listNames.add(p.getText()));


        return listNames.contains(itemName);
    }


}
