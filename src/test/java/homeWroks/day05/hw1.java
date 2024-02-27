package homeWroks.day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class hw1 {
    //Task 1:
    //Go to URL: https://demoqa.com/radio-button
    //Verify whether all 3 options given to the question can be selected.
    //When each option is selected, print the following texts on the console.

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

//@Test
//     public void task1() throws InterruptedException {
//        List<WebElement> radioButt = driver.findElements(By.xpath("//div[starts-with(@class,'custom-control')]"));
//        radioButt.get(0).click();
//    Assert.assertTrue(radioButt.get(0).isSelected());
//    radioButt.get(1).click();
//    Assert.assertTrue(radioButt.get(1).isSelected());
//    radioButt.get(2).click();
//    Assert.assertTrue(radioButt.get(2).isSelected());
//
//      for (WebElement button : radioButt){
//          button.click();
//          button.getText();
//          Assert.assertTrue("There's a button not working",button.isSelected());
//          Thread.sleep(2000);
//      }
//JavascriptExecutor js = (JavascriptExecutor) Driver.

    @Test
    public void task1() throws InterruptedException {
        List<WebElement> radioButtons = driver.findElements(By.xpath("//div[starts-with(@class,'custom-control')]"));

        for (WebElement radioButton : radioButtons) {
            radioButton.click();
            Assert.assertTrue(radioButton.isSelected());
            System.out.println("Option selected: " + radioButton.getText()); // Print the selected option
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //Thread.sleep(3000);
        }
    }


}





