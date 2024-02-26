package homeWroks.day03;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw2 {
   //Navigate to website  https://testpages.herokuapp.com/styled/index.html
   static WebDriver driver;

    //Under the Examples
   //Click on Locators - Find By Playground Test Page
    @BeforeClass
    public static void beforeC(){
        driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/index.html");
    }
@AfterClass
public static void afterT(){
        driver.close();
}
    @Test
    public void t1() throws InterruptedException {
        driver.findElement(By.id("findbytest")).click();        // locators , Playground then click
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("webdriverexamplepage")).click();
        System.out.println(driver.getCurrentUrl());
        WebElement entery = driver.findElement(By.id("numentry"));
        entery.sendKeys("20"+ Keys.ENTER);          // entry of the num

         System.out.println(driver.findElement(By.id("message")).getText());            // the result will be printed
        //Assert.assertTrue(e);


    }
   //Print the URL
   //Navigate back
   //Print the URL
   //Click on WebDriver Example Page
   //Print the URL
   //Enter value 🡪 20 and Enter to "Enter Some Numbers inputBox"
   //And then verify 'two, zero' message is displayed on page
   //Close driver.
}
