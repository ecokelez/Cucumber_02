package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniPage;
import utilities.ConfigReader;
import utilities.Driver;


import java.util.ArrayList;
import static junit.framework.TestCase.*;


public class WebUniStepdefinition {

    WebUniPage webUniPage = new WebUniPage();
    Actions actions = new Actions(Driver.getDriver());

    String firstWindow;

    ArrayList<String> windows;
    @Given("User goes homepage that {string}")
    public void userGoesHomepageThat(String searchedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @Then("User scroll down until Login Portal")
    public void userScrollDownUntilLoginPortal() {
        firstWindow = Driver.getDriver().getCurrentUrl();
       actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Click on Login Portal")
    public void clickOnLoginPortal() {
        webUniPage.loginPortalWE.click();

    }

    @And("Switch to the  other Window")
    public void switchToTheOtherWindow() {
        windows = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));
    }

    @And("Enter values in the {string}")
    public void enterValuesInThe(String username) {
        webUniPage.usernameBox.sendKeys(username);

    }

    @And("Enter values in the  {string}")
    public void enterValueInThe(String password) {
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
    }

    @And("Click on the Login button")
    public void clickOnTheLoginButton() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
    }

    @And("Test that the text in Popup is validation failed")
    public void testThatTheTextInPopupIsValidationFailed() {
        String actualPopupText = Driver.getDriver().switchTo().alert().getText();
        String expectedPopupText = "validation failed";
        assertEquals(expectedPopupText,actualPopupText);
    }

    @And("Close the Popup by saying OK")
    public void closeThePopupBySayingOK() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("Back to the first page")
    public void backToTheFirstPage() {
        Driver.getDriver().switchTo().window(windows.get(0));
    }

    @And("Test whether back to the first page")
    public void testWhetherBackToTheFirstPage() {
        assertEquals(Driver.getDriver().getCurrentUrl(),firstWindow);


    }
}
