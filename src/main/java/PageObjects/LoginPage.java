package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "input-email")
    WebElement emailField;
    @FindBy(id = "input-password")
    WebElement passowrdField;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement SubmitBtn;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
//    *********************************// Action //********************


}
