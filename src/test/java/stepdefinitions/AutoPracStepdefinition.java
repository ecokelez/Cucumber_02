package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPage;
import utilities.ConfigReader;
import utilities.Driver;

import static junit.framework.TestCase.assertTrue;

public class AutoPracStepdefinition {

    AutoPage autoPage = new AutoPage();
    Actions actions = new Actions(Driver.getDriver());

    Faker faker = new Faker();
    @Given("User go to the {string} web page")
    public void userGoToTheWebPage(String searchedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @Then("User click the Sign in link")
    public void userClickTheSignInLink() {
        autoPage.signInButton.click();
    }

    @And("User enter email adress on the Create and account section")
    public void userEnterEmailAdressOnTheCreateAndAccountSection() {
        autoPage.emailBox.sendKeys(faker.internet().emailAddress());

    }

    @And("User click Create and account button")
    public void userClickCreateAndAccountButton() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("User enter personel nformation and contact details")
    public void userEnterPersonelNformationAndContactDetails() {
        actions.sendKeys(autoPage.titleButton).sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).
                sendKeys("5").sendKeys(Keys.TAB).sendKeys("July").sendKeys(Keys.TAB).
                sendKeys("1994").sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();

    }

    @And("Click Register button")
    public void clickRegisterButton() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("Verify account creation")
    public void verifyAccountCreation() {
        assertTrue(autoPage.accountAlert.isDisplayed());
    }

    @And("User close the page")
    public void userCloseThePage() {
        Driver.closeDriver();
    }
}
