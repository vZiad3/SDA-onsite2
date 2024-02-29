package homeWroks.day07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hw1 {
    static WebDriver driver;


    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }
    @AfterClass
    public static void tearDown(){
       driver.quit();
    }
    @Test
    public void task(){
         WebElement fButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
         fButton.click();
        Alert alert = driver.switchTo().alert() ;
        alert.accept();
    }
    @Test
    public void task2(){
        WebElement sButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        sButton.click();
        Alert alert = driver.switchTo().alert() ;
        alert.accept();
    }
    @Test
    public void task3(){
        WebElement tButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        tButton.click();
        Alert alert = driver.switchTo().alert() ;

        alert.sendKeys("\"Offer abdullah a tea\")");
        alert.accept();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertTrue(result.isDisplayed());


    }
}
