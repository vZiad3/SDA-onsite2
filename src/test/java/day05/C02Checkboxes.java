package day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C02Checkboxes {
    /*
    Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes.
Then click on checkbox 1 if box is not selected.
Then click on checkbox 2 if box is not selected.
Then verify that checkbox 1 is checked.

     */
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }


    @Test
    public void checkBoxeTest(){
        //locate elements
       List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[@type='checkbox']"));


        if (!checkBoxes.get(0).isSelected()){           // if first checkbox NOT SELECTED  ' ! '
            checkBoxes.get(0).click();
            System.out.println("Check box has been selected ");
        }
        if (!checkBoxes.get(1).isSelected()){           // if second checkbox NOT SELECTED  ' ! '
            checkBoxes.get(1).click();
            System.out.println("Check box has been selected ");
        }
        else {
            System.out.println("Check box is already selected");
        }
        // Now both should be selected because the previous if statement
        Assert.assertTrue(checkBoxes.get(0).isSelected());
        Assert.assertTrue(checkBoxes.get(1).isSelected());





    }










}
