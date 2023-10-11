package TestCases;


import PageObjects.Homepage;
import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static Utilities.util.TimestampEmail;

public class LoginTest
{
    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
       String Broswer="chrome";

        if (Broswer.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
        }
        else if (Broswer.equalsIgnoreCase("edge"))
        {
            driver=new EdgeDriver();
        }
        else if (Broswer.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
        }
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void validdeails()
    {
        Homepage homepage=new Homepage(driver);
        homepage.SelectLoginPage();
        LoginPage loginPage=new LoginPage(driver);



    }
    @Test
    public void Invalid_deatils()
    {
        Homepage homepage=new Homepage(driver);
        homepage.SelectLoginPage();
        LoginPage loginPage=new LoginPage(driver);
//        ???????
        String text= driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]")).getText();
        Assert.assertEquals(text,"Warning: No match for E-Mail Address and/or Password.","element not found");

    }

    public void No_deatils()
    {
        Homepage homepage=new Homepage(driver);
        homepage.SelectLoginPage();
        LoginPage loginPage=new LoginPage(driver);
//       ??????
        String text= driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]")).getText();
        Assert.assertEquals(text,"Warning: No match for E-Mail Address and/or Password.","element not found");

    }


    @AfterMethod
    public void Teardown()
    {
       driver.quit();
    }
}
