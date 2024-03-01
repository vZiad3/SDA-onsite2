package homeWroks.day07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class hw2 {
    static WebDriver driver;


    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://the-internet.herokuapp.com/basic_auth");
        //driver.get("https://admin:admin2the-interent.herokuapp.com/basic_auth");

        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        //alert = wait.until(ExpectedConditions.alertIsPresent());

    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

    @Test
    public void signIn() throws InterruptedException {

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(3000);
        WebElement authMess = driver.findElement(By.xpath("(//p[contains(text(),'Congratulations! You must have the proper credenti')])"));
        Assert.assertTrue(authMess.isDisplayed());

        ///  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
     /// Alert alert = driver.switchTo().alert();
     ///  alert = wait.until(ExpectedConditions.alertIsPresent());
     /// // alert.dismiss();
     /// driver.switchTo().alert().sendKeys("admin" + Keys.TAB + "admin");
     ///  alert.accept();

     /// //driver.switchTo().alert().sendKeys("admin" );
     /// //alert.sendKeys("admin" );
     ///  driver.switchTo().alert().accept();       ////alert.sendKeys(String.valueOf(Keys.TAB));

     ///  //alert.sendKeys(Keys.ENTER);

     ///  //driver.switchTo().alert().sendKeys("admin");


    }

    }
