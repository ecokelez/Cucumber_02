package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private Driver(){

    }


    //=>POM'de Driver icin TestBase Class'ında extends etmek yerine Driver Class'ından
    //==> static methodlar kullanarak driver olusturup, ilgili ayarların yapılabilmesi
    //===> ve en sonda driver'ın kapatılması tercih edilmistir.

    /*
   ==> Testlerimizi çalıştırdığımızda her seferinde yeni driver oluşturduğu için her test methodu
   için yeni bir pencere(driver) açıyor.
   ==> Eğer driver'a bir değer atanmamışsa yani driver==null ise
   bir kere driver'i çalıştır diyerek bir kere if içini çalıştıracak. Ve driver artık bir kere
   çalıştığı için ve değer atandığı için null olmayacak ve direk return edecek ve diğer
   teslerimiz aynı pencere(driver) üzerinde çalışacak
    */

    static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver == null){

            switch (ConfigReader.getProperty("browser")){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options=new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                    break;
                    //WebDriverManager.chromedriver().setup();
                    //driver = new ChromeDriver();
                   // break;
                case "safari"    :
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox"  :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge"     :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }

        return driver;
    }

    public static void closeDriver(){
        if (driver != null){   // ==>  driver'a deger atanmıssa kapat
            driver.close();
            driver = null;  //=>Kapandıktan sonraki acmaları garanti altına almak icin  driver'i tekrar null yaptık
        }

    }

    public static void quitDriver(){
        //driver.quit();
    }
}
