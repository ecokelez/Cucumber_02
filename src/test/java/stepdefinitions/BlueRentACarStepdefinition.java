package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcHomePage;
import pages.BrcLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentACarStepdefinition {

    BrcHomePage brcHomePage = new BrcHomePage();
    BrcLoginPage brcLoginPage = new BrcLoginPage();
    @Given("User on the {string} homepage")
    public void userOnTheHomepage(String searchedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @Then("Clicks Login")
    public void clicksLogin() {
        brcHomePage.brcHomePageLogin.click();
    }

    @And("Enters invalid username")
    public void entersInvalidUsername() {
        brcLoginPage.emailBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
    }

    @And("Enters invalid password")
    public void entersInvalidPassword() {
        brcLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
    }

    @And("Presses the Login button")
    public void pressesTheLoginButton() {
        brcLoginPage.loginButton.click();
    }

    @Then("Checks that the page cannot be accessed")
    public void checksThatThePageCannotBeAccessed() {
        Assert.assertTrue(brcLoginPage.loginFailed.isDisplayed());
    }

    @And("The user closes the page")
    public void theUserClosesThePage() {
        Driver.closeDriver();
    }

}
