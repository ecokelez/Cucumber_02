package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BrcHomePage;
import pages.BrcLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {
    //Create Page Objects
    BrcHomePage brcHomePage;
    BrcLoginPage brcLoginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;
    @Given("User enters in with {string} information")
    public void user_enters_in_with_information(String pageName) {
     String path = "src/test/resources/testdata/mysmoketestdata.xlsx";
     //String page = "customer_info";
     excelUtils = new ExcelUtils(path,pageName);
     excelData = excelUtils.getDataList();

     // complete the loop code
     for(Map<String,String> data : excelData){
         // Go to homepage
         Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
         brcHomePage = new BrcHomePage();
         brcLoginPage = new BrcLoginPage();
         // Click the home page login button
        brcHomePage.brcHomePageLogin.click();
         ReusableMethods.waitFor(1);
         // send the email
         brcLoginPage.emailBox.sendKeys(data.get("username"));
         ReusableMethods.waitFor(1);
         // send the password
         brcLoginPage.passwordBox.sendKeys(data.get("password"));
         ReusableMethods.waitFor(1);
         //click the login button
         brcLoginPage.loginButton.click();
         // Verify that enter the home page==>if id is visible  the assertion is successful
         Assert.assertTrue(brcHomePage.userId.isDisplayed());
         try {
             ReusableMethods.getScreenshot("Login screenshot");
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         // log out
         brcHomePage.userId.click();
         ReusableMethods.waitFor(1);
         brcHomePage.logOutLink.click();
         ReusableMethods.waitFor(1);
         brcHomePage.okButton.click();
         ReusableMethods.waitFor(1);
     }

         Driver.closeDriver();
    }

}
