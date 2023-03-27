package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        //=> Sadece Runnner Class'ından calistirdigimizda (plugin=..) bu raporu alabilriz ve
        //==> target altinda cucumber-reports icinde raporlarimizi gorebilirz

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@grup1",  // iki tag'i aynı anda calistirmak istersek => @gp1 or @gp2",
        dryRun = false
)

public class TestRunner01 {


}
