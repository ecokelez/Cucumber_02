package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class GuruStepdefinition {

    GuruPage guruPage = new GuruPage();

    @Given("User on the {string} web page")
    public void userOnTheWebPage(String searchedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @And("{string}, prints all values in the column")
    public void printsAllValuesInTheColumn(String title) {

        int index = 0;

        for (int i = 0; i < guruPage.titles.size(); i++) {
            if (guruPage.titles.get(i).getText().equals(title)){
                System.out.println(guruPage.titles.get(i).getText());

                index = i+1; // Featuredan  gelen  i degerine esitledigimiz String'i ayni degere sahip sutunlarda
                //==> yazdirabilmek icin bos bir koyteynıra atadık.
                //Listte index 0 dan bas. icin ve WebTable locate'imiz 1 den bas. icin i degerini bir arttırdik

                List<WebElement> columnWE = Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                //Sonrasinda WebTable' daki body'i locate edip esitledigimiz index'i baslik altindaki sutunu getirebilmesi
                // icin bu liste attık


                //Lambda ve ya foreach ile de  ile sutunu yazdirdik
                System.out.println("Print with Lambda");
                columnWE.forEach(t-> System.out.println(t.getText()));
                System.out.println("Print with ForEach");
                for (WebElement w:columnWE) {
                    System.out.println(w.getText());
                }
            }

        }
    }


}
