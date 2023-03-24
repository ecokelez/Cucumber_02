package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ClassworkBRCStepdefinition {

    BrcPage brcPage = new BrcPage();
    @Given("user goes to {string} homepage")
    public void userGoesToHomepage(String searchedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @Then("Clicks Log in")
    public void clicksLogIn() {
        brcPage.brcHomePageLogin.click();

    }

    @And("enters the  invalid {string}")
    public void entersTheInvalid(String wrongEmail) {
        brcPage.emailBox.sendKeys(wrongEmail);
    }

    @And("enters invalid {string}")
    public void entersInvalid(String wrongPassword) {
        brcPage.passwordBox.sendKeys(wrongPassword);
    }

    @And("Presses on the Login button")
    public void pressesOnTheLoginButton() {
        brcPage.loginButton.click();
    }

    @Then("checks that the page cannot be accessed")
    public void checksThatThePageCannotBeAccessed() {
        Assert.assertTrue(brcPage.loginFailed.isDisplayed());
    }

    @And("user waits {int} seconds")
    public void userWaitsSeconds(int requestedTime) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("closes the page")
    public void closesThePage() {
        //Driver.closeDriver();
    }
}
