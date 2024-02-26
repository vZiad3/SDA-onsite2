package homeWroks.day03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hw1 {


    //task01:
    static WebDriver driver;

    //Create the driver with BeforeClass and make it static inside the class.

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement placeholder = driver.findElement(By.className("gLFyf"));
    }


    //Go to http://www.google.com
    //Type "Green Mile" in the search box and print the number of results.
    @Test
    public void test1() {
       driver.findElement(By.className("gLFyf")).sendKeys("Green Mile"+ Keys.ENTER);
        System.out.println(driver.findElement(By.id("result-stats")).getText());

    }
    //Type "Premonition" in the search box and print the number of results.
    @Test
    public void test2() {
        driver.findElement(By.name("q")).sendKeys("Premonition"+ Keys.ENTER);
        System.out.println(driver.findElement(By.id("result-stats")).getText());

    }
    //Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
    @Test
    public void test3() {
        driver.findElement(By.name("q")).sendKeys("The Curious Case of Benjamin Button"+ Keys.ENTER);
        System.out.println(driver.findElement(By.id("result-stats")).getText());

    }
    //Close with AfterClass.
    @AfterClass
    public static void tearDown(){

        driver.quit();
    }
}



//
 //       static WebDriver driver;
//
 //
 //       @AfterClass
 //       public static void afterTest(){
 //           System.out.println("Finshed");
 //           driver.close();
 //       }
//
 //       @After
 //       public  void afterT() {
 //           driver.quit();
//
 //       }
//
//
 //       @Test
 //       public void typing(){
 //           WebElement placeholder = driver.findElement(By.className("gLFyf"));
 //           String entery1 = "Green Mile";
 //           placeholder.sendKeys(entery1);
 //           System.out.println("The reslut of the entery is : " +entery1 );
 //       }
//
 //   @Test
 //   public void typing2(){
 //      driver.findElement(By.className("gLFyf")).sendKeys("Premonition");
 //       String entery2 = "Premonition";
 //       placeholder.sendKeys(entery2);
 //       System.out.println("The reslut of the entery is : " +entery2 );
 //   }
 //   @Test
 //   public void typing3(){
 //       WebElement placeholder = driver.findElement(By.className("gLFyf"));
 //       String entery3 = "The Curious Case of Benjamin Button";
 //       placeholder.sendKeys(entery3);
 //       System.out.println("The reslut of the entery is : " +entery3 );
 //   }
//


