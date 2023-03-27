package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot=((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();

        //Scenario Class'indan scenario degiskeni olusturup,TakesScreenshot' a atariz
        //getScreenshotAs methduyla scenario.isFailed olursa
        //scenario'ya attach olarak ekle (screenshot,"image/png,","screenshots")

        //➢ Cucumber hooks,senaryolardan önce veya sonra çalışan kod
        //bloklarına sahip olan bir classtır. (Daha once kullandigimiz
        //TestBase gibi)
        //➢ @Before ve @After annotation’ları kullanılarak kodları projemizde
        //ve step definitionlarda kullanabiliriz.
        //➢ Cucumber hooks, kod çalışma akışını daha iyi yönetmemizi
        //kolaylaştırır ve kod fazlalığını azaltmamıza yardımcı olur.
    }
}
