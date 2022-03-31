package com.trycloud.utilities;


import com.trycloud.pages.HomePage_ahmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class TryCloudUtils {

    public static Actions actions = new Actions(Driver.getDriver());
    public static HomePage_ahmet homePage = new HomePage_ahmet();

    public static void headerButton(String head) {
        head = head.toLowerCase();

        actions.click(Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']/li[@data-id='" + head + "']"))).perform();

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
        actions.moveToElement(homePage.uploadFileBtn).sendKeys(path).click().perform();
    }

    public static boolean itemCheckInTheList(String itemName){
        boolean result = false;
        for (WebElement item : homePage.allFilesTableList) {

            if(item.getText().equals(itemName)){
                BrowserUtils.sleep(1);
             result =true;}
        }
        return result;
    }


}
