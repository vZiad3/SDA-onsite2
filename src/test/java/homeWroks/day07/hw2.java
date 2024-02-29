package homeWroks.day07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
        driver.get("https://the-internet.herokuapp.com/basic_auth");

    }
    @AfterClass
    public static void tearDown(){
       // driver.quit();
    }

    @Test
    public void signIn() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/basic_auth");
Thread.sleep(5000);
Alert alert = driver.switchTo().alert();


        //Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //Alert alert = driver.switchTo().alert();

        alert.sendKeys("admin" + Keys.TAB + "admin");
        alert.accept();
        //alert.sendKeys(String.valueOf(Keys.TAB));

        //alert.sendKeys(Keys.ENTER);

        //driver.switchTo().alert().sendKeys("admin");

        alert.accept();



    }

    }
