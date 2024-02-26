package day04;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class challengeAmeer {
    //Lunch browser
    //Navigate to the application
    //Click on 'Signup / Login' button
    //Enter correct email address and password
    //click login button

    static WebDriver driver;
    @BeforeClass
    public static void beforeC() {

        driver = new ChromeDriver();
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }




    @Test
    public void task5() throws InterruptedException {
        System.out.println("Browser is opened");

        driver.get("https://automationexercise.com/");

        String expected = "https://automationexercise.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertTrue("The page is not the right one ", actual.contains("automation"));


        WebElement logo = driver.findElement(By.partialLinkText("Website for automation practice"));
        Assert.assertTrue(logo.isDisplayed());
        System.out.println("Homepage is visible successfully");



        //  login/Signup icon
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement login = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));            // ***
        login.click();
        Assert.assertTrue("the page is not open " , login.isDisplayed());
        System.out.println("Login to your account’ is visible");

        WebElement loginBut = driver.findElement(By.xpath("//*button[contains(text(),'login')]"));
        Assert.assertTrue("Account login is not is visible" , loginBut.isDisplayed());


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.name("email")).sendKeys("sda@test.com");
        driver.findElement(By.name("password")).sendKeys("sdainclasstask");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();


    }



}
