package day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C03Dropdown2 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
    }
    @AfterClass
    public static void tearDown(){

        //driver.quit();
    }
    @Test
    public void dropDownTest(){

        //Locate select
        WebElement oldStyle = driver.findElement(By.id("oldSelectMenu"));
        // Create select object
        Select select = new Select(oldStyle);

        //Select by index;
        //select.selectByIndex(3);        // index 3 == 4 starting from 0
        select.selectByValue("4");

        System.out.println("select.isMultiple() = " + select.isMultiple());     // false = cannot select multiple options

        WebElement element2 = driver.findElement(By.id("cars"));

        Select select2 = new Select(element2);
        System.out.println("select2.isMultiple() = " + select2.isMultiple());       // true --> can select multiple options


    }









}
