package day08;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;

public class C03BaseClass extends TestBase {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test1(){
        driver.get("https://www.amazon.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());


    } @Test
    public void test2(){
        driver.get("htpps://www.amazon.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }







}
