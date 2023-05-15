package stepdefinitions.grid_stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;


public class SeleniumGridStepdefinition {

    WebDriver driver;

    @Given("User is on the home page {string} by Chrome")
    public void user_is_on_the_home_page_by_chrome(String searchUrl) throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"), new ChromeOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(searchUrl);
    }
    @Then("User verifies title is {string}")
    public void user_verifies_title_is(String title) {
        assertEquals(title,driver.getTitle());

    }
    @Then("User closes the remote driver")
    public void user_closes_the_remote_driver() {
       driver.quit();

    }

    @Given("User is on the home page {string} by Edge")
    public void userIsOnTheHomePageByEdge(String url) throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"), new EdgeOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Given("User is on the home page {string} by Firefox")
    public void userIsOnTheHomePageByFirefox(String url) throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"), new FirefoxOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
}
