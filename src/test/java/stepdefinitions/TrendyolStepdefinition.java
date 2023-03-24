package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class TrendyolStepdefinition {
    @Given("User enters the page {string}")
    public void userEntersThePage(String searchedUrl) {
        Driver.getDriver().get(searchedUrl);
    }
}
