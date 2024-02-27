package day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04RadioButtons {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }


    @Test
    public void radButtonTest() throws InterruptedException {
        //Go to URL:  https://www.facebook.com/
        driver.get("https://www.facebook.com/");
        //Click on Create an Account button.
       //  driver.findElement(By.id("u_0_0_V1")).click();        // dynamic its not gonna work with the full id
        driver.findElement(By.xpath("//*[starts-with(@id,'u_0_0')]")).click();

        //Then click on the radio buttons.
        List<WebElement> radioButt=driver.findElements(By.xpath("//input[@type='radio']"));        radioButt.get(0).click();
        Assert.assertTrue(radioButt.get(0).isSelected());
        radioButt.get(1).click();
        Assert.assertTrue(radioButt.get(1).isSelected());
        radioButt.get(2).click();
        Assert.assertTrue(radioButt.get(2).isSelected());

        for(WebElement button : radioButt){                 // for each  , for each increment without writing  button++
            button.click();
            Assert.assertTrue(button.isSelected());
            Thread.sleep(1000);
        }

    }
}



