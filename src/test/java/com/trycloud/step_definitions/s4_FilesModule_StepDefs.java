package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.TryCloudLogin;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class s4_FilesModule_StepDefs {

    //Scenario #1

    FilesPage filesPage = new FilesPage();

    @When("the user clicks {string} module")
    public void theUserClicksModule(String files) {
        filesPage.filesTab.click();

    }

    @Then("verify the page title is \"Files - Trycloud QA.”")
    public void verify_the_page_title_is_files_trycloud_qa() {
        String expectedTitle = "Files - Trycloud QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    //Scenario #2



    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        filesPage.filesTab.click();
        filesPage.leftCheckbox.click();

    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        List<WebElement> checkbox = new ArrayList<>();
        for (WebElement each : checkbox) {
            Assert.assertTrue(each.isSelected());
        }
        Assert.assertTrue(filesPage.checkBoxes.isSelected());
    }


}

