package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentACarStepdefinition {

    BrcPage brcPage = new BrcPage();
    @Given("User on the {string} homepage")
    public void userOnTheHomepage(String searchedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @Then("Clicks Login")
    public void clicksLogin() {
        brcPage.brcHomePageLogin.click();
    }

    @And("Enters invalid username")
    public void entersInvalidUsername() {
        brcPage.emailBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
    }

    @And("Enters invalid password")
    public void entersInvalidPassword() {
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
    }

    @And("Presses the Login button")
    public void pressesTheLoginButton() {
        brcPage.loginButton.click();
    }

    @Then("Checks that the page cannot be accessed")
    public void checksThatThePageCannotBeAccessed() {
        Assert.assertTrue(brcPage.loginFailed.isDisplayed());
    }

    @And("The user closes the page")
    public void theUserClosesThePage() {
        Driver.closeDriver();
    }


}
