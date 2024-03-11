package day12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;

public class C04TakeScreenShot extends TestBase {
    @Test
    public void takeSpecificElementScreenshot() {
        driver.get("https://linkedin.com");

        TakesScreenshot ts = (TakesScreenshot) driver;
        WebElement headline = driver.findElement(By.xpath("//*[@data-test-id='hero__headline']"));
        //File source = headline.
        }
    }
