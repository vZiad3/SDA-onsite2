package homeWroks.day04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hw1 {
//1.Go to https://www.temu.com/.
//            2.Type "iphone" in the search bar and click ENTER.
//3.Print the result number.
//            4.Click on the first product that appears.
//5.Add to cart.
//6.Click on the cart icon.
//7.Print the product price
//8.Complete your shopping..
//            9.Turn off the driver.


    static WebDriver driver;

    @BeforeClass
    public static void beforeC() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.temu.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterClass
    public static void tearDown() {
    }

    @Test
    public void task1() {

        //driver.findElement(By.id("searchInput")).click();
        driver.findElement(By.id("searchInput")).sendKeys("iphone",Keys.ENTER);

        driver.findElement(By.xpath("//div[class='_1TKvD9PP']")).getText();

        driver.findElement(By.xpath("(//span[@class='_1vW8aHMS _3kEAZ8WC'])[1]")).click();
        driver.findElement(By.className("_2ElsTisy")).click();
        driver.findElement(By.linkText("آيفون 14 برو ماكس")).click();
        driver.findElement(By.xpath("(//span[@class='_2ElsTisy'])[7]")).click();
        System.out.println("the total amountt is : "+ driver.findElement(By.className("_1U8wVMYM _2rY4v2rT")).getText());
        driver.findElement(By.xpath("(//span[contains(text(),'إتمام عملية الشراء (1)')])[1]")).click();


    }
}
