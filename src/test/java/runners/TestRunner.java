package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", // for reports more readeble
                "html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt"
        },
        //=> Sadece Runnner Class'ından calistirdigimizda (plugin=..) bu raporu alabilriz ve
        //==> target altinda cucumber-reports icinde raporlarimizi gorebilirz

        monochrome = true, // for reports more readeble on the console
        features = "src/test/resources/GridFeatures",
        glue = {"stepdefinitions"},
        tags = "@Grid",
        dryRun = false
)
public class TestRunner {
}
