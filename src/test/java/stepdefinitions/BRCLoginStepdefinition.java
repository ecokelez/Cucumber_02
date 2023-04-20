package stepdefinitions;

import io.cucumber.java.en.*;
import pages.BrcHomePage;
import pages.BrcLoginPage;

import java.util.List;
import java.util.Map;

public class BRCLoginStepdefinition {

    BrcLoginPage brcLoginPage = new BrcLoginPage();
    @Then("User enters email and password")
    public void user_enters_email_and_password(io.cucumber.datatable.DataTable dataTable) {
        // 1- We can store the data using  List<String>
        //List<String> adminInfo = dataTable.row(1);
        //System.out.println(adminInfo.get(0));
        //System.out.println(adminInfo.get(1));
        //brcPage.emailBox.sendKeys(adminInfo.get(0));
        //brcPage.passwordBox.sendKeys(adminInfo.get(1));

        // We can store the data using List<Map<String,String>>
      List<Map<String,String>> adminInfo = dataTable.asMaps(String.class, String.class);
        System.out.println(adminInfo);
        for (Map<String,String> admin: adminInfo) {
            brcLoginPage.emailBox.sendKeys(admin.get("email"));
            brcLoginPage.passwordBox.sendKeys(admin.get("password"));
            brcLoginPage.loginButton.click();
        }


    }
}
