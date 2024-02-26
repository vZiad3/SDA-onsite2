package day03;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02AssertionTest {
    /*
Go to Google homepage
Do the following tasks by creating 3 different test methods.
1- Test if the URL contains google.
2- Test if the title does not contain Facebook.
3- Test that the Google logo appears on the page.
*/
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");              /// because the test will be in the same page
    }

    @AfterClass
    public static void afterFin() {
        driver.quit();
    }


//1- Test if the URL contains google.

    @Test
    public void urlTest() {
        String expectedURL = "https://www.google.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains("google"));
    }


    //2- Test if the title does not contain Facebook.
@Test
    public void titleNot(){
        String title = driver.getTitle();
        Assert.assertFalse(title.contains("Facebook"));
}

//3- Test that the Google logo appears on the page.
    @Test
    public void logotest(){
    WebElement logo = driver.findElement(By.className("lnXdpd"));
    Assert.assertTrue(logo.isDisplayed());                          // it will be passed if the logo is displayed

    }


    @Test
    public void entery() throws InterruptedException {
        WebElement ent = driver.findElement(By.className("lnXdpd"));
        Thread.sleep(5000);
        ent.sendKeys("Hello"+ Keys.SPACE + "World ");
    }
}