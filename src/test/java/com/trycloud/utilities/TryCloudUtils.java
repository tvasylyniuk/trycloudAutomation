package com.trycloud.utilities;


import com.trycloud.pages.HomePage_ahmet;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class TryCloudUtils {

    public static Actions actions = new Actions(Driver.getDriver());
    static HomePage_ahmet homePage = new HomePage_ahmet();

    public static void headerButton(String head) {

        actions.click(Driver.getDriver().findElement(By.xpath("(//span[normalize-space(text())='" + head + "'])[1]"))).perform();

    }

    public static void sideMenuButtons(String sideBtn) {

        Driver.getDriver().findElement(By.linkText(sideBtn)).click();

    }

    public static List<String> favoritesList() {

        List<String> listOfFav = new ArrayList<>();
        homePage.listOfFavTable.forEach(p -> listOfFav.add(p.getText()));

        return listOfFav;
    }


}
