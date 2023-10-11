package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

public class Homepage {
    WebDriver driver;
    public  Homepage(WebDriver driver)
    {
      this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement Myaoocuntdrop;
    @FindBy(linkText = "Login")
    WebElement loginOption;



//************************************// Action //********************************
    public void SelectLoginPage()
    {
        Myaoocuntdrop.click();
        loginOption.click();
    }



}
