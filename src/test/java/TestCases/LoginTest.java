package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

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
    public void test()
    {
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("sharathchandra@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Security@#1");
        driver.findElement(By.xpath("//input[@type='submit']")).click();


    }


    @AfterMethod
    public void Teardown()
    {
       driver.quit();
    }
}
