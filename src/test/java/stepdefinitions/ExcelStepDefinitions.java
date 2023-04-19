package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.BrcHomePage;
import pages.BrcLoginPage;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {
    BrcHomePage brcHomePage;
    BrcLoginPage brcLoginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;
    @Given("User enters in with {string} information")
    public void user_enters_in_with_information(String string) {
     String path = ".src/test/resources/testdata/mysmoketestdata.xlsx";
     String page = "customer_info";
     excelUtils = new ExcelUtils(path,page);
     excelData = excelUtils.getDataList();

    }

}
