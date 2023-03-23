package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;



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
}
