package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcHomePage {

    public BrcHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement brcHomePageLogin;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement emailBox;

    @FindBy (xpath = "//*[@id='formBasicPassword']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement loginFailed;
}
