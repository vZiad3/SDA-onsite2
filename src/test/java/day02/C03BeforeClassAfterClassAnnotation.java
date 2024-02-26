package day02;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03BeforeClassAfterClassAnnotation {
    static WebDriver driver;                                 // We must delare Driver inside the class, + we use static for Beforeclass & After class.
   @BeforeClass                                                 // before doing the other things
   public  static void beforeclass(){
       driver = new ChromeDriver();
       System.out.println("Before class method is executed...");
   }

   @AfterClass
   // after executing all the method  , unlike @after it excuting after every @test
    public  static void afterClass(){
       driver.quit();
       driver.quit();
       System.out.println("After class method is executed...");
   }

   @Test
    public void test01(){
       driver.get("https://google.com");
       driver.manage().window().maximize();
       System.out.println("Test 1 is executed...");
   }

    @Test
    public void test02(){
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        System.out.println("Test 2 is executed...");
    }

}
