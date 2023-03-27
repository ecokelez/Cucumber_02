package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerOkuAppPage;
import utilities.ConfigReader;
import utilities.Driver;
import java.time.Duration;



public class HerOkuAppStepdefinition {

    HerOkuAppPage herOkuAppPage = new HerOkuAppPage();
    @Given("User goes to herokuUrl")
    public void userGoesToHerokuUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("herokuUrl"));
    }

    @Then("Press the  Add Element button")
    public void pressTheAddElementButton() {
        herOkuAppPage.addElementButton.click();


    }

    @And("Wait until the Delete button is visible")
    public void waitUntilTheDeleteButtonIsVisible() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herOkuAppPage.deleteButton));
    }

    @And("Test whether the Delete button is visible")
    public void testWhetherTheDeleteButtonIsVisible() {
        assert herOkuAppPage.deleteButton.isDisplayed();

    }

    @And("Delete button by pressing the  button")
    public void deleteButtonByPressingTheButton() {
        herOkuAppPage.deleteButton.click();

    }

    @And("Test that the AddRemove Element font is visibility")
    public void testThatTheAddRemoveElementFontIsVisibility() {
        assert herOkuAppPage.addRemoveElementsWE.getText().equals("Add/Remove Elements");
        //assert herOkuAppPage.addRemoveElementsWE.isDisplayed();

    }

    @And("Test that  the Delete button is not visible")
    public void testThatTheDeleteButtonIsNotVisible() {
        assert! herOkuAppPage.deleteButton.isDisplayed();

    }

    @And("Close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }
}
