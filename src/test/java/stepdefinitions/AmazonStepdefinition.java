package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class AmazonStepdefinition {

    AmazonPage amazonPage = new AmazonPage();
    @Given("User goes to Amazon page")
    public void userGoesToAmazonPage() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("User searches for Nutella")
    public void userSearchesForNutella() {
    amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);

    }

    @And("User tests whether the resutls contain Nutella")
    public void userTestsWhetherTheResutlsContainNutella() {
        String searchedWord = "Nutella";
        String actualSearchResult = amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualSearchResult.contains(searchedWord));
    }

    @And("Closes the page")
    public void closesThePage() {
        Driver.closeDriver();
    }

    @Then("User searches for Selenium")
    public void userSearchesForSelenium() {
        amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER);
    }

    @And("User tests whether the results contain Selenium")
    public void userTestsWhetherTheResultsContainSelenium() {
    }

    @Then("User searches for Ipone")
    public void userSearchesForIpone() {
        amazonPage.searchBox.sendKeys("Iphone", Keys.ENTER);
    }

    @And("User tests whether the resutls contain Iphone")
    public void userTestsWhetherTheResutlsContainIphone() {
    }

    @Then("User searches for {string}")
    public void userSearchesFor(String searchedWord) {
        amazonPage.searchBox.sendKeys(searchedWord,Keys.ENTER);
    }

    @And("User tests whether the resutls contain {string}")
    public void userTestsWhetherTheResutlsContain(String searchedWorld) {
        String actualSearchResult = amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualSearchResult.contains(searchedWorld));
    }

    @Given("User goes to {string} page")
    public void userGoesToPage(String searchedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @Then("User tests that the URL contains {string}")
    public void userTestsThatTheURLContains(String requestedUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(requestedUrl));
    }

    @Then("User waits {int} seconds")
    public void userWaitsSeconds(int requestedTime) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("User takes a screenshot")
    public void user_takes_a_screenshot() {
        try {
            ReusableMethods.getScreenshot("screenshot");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
