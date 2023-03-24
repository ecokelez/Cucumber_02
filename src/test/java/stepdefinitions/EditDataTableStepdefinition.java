package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EDTPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EditDataTableStepdefinition {
    EDTPage edtPage = new EDTPage();
    Actions actions = new Actions(Driver.getDriver());
    @When("User goes to {string}")
    public void userGoesTo(String searchedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @Then("presses the New button")
    public void pressesTheNewButton() {
        edtPage.newButton.click();

    }

    @And("enters {string} in the Name section")
    public void entersInTheNameSection(String firstname) {
        edtPage.firstNameBox.sendKeys(firstname);
    }

    @And("enters {string} in the last name section")
    public void entersInTheLastNameSection(String lastname) {
        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();
    }

    @And("enters {string} in the Position section")
    public void entersInThePositionSection(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("enters {string} in the Office section")
    public void entersInTheOfficeSection(String officeLocation) {
        actions.sendKeys(Keys.TAB).sendKeys(officeLocation).perform();
    }

    @And("enters {string} in the Extension section")
    public void entersInTheExtensionSection(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("Startdate enters {string}")
    public void startdateEnters(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("Salary enters {string}")
    public void salaryEnters(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("presses the Create button")
    public void pressesTheCreateButton() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @When("User searches with {string}")
    public void userSearchesWith(String firstname) {
        edtPage.searchBox.sendKeys(firstname);
    }

    @Then("confirms that there is {string} in the Name section")
    public void confirmsThatThereIsInTheNameSection(String searchedName) {
        Assert.assertTrue(edtPage.firstNameControl.getText().contains(searchedName));
    }
}
