package homeWroks.day05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hw2 {
   // Task 2:
   //         * breakout task: (in a separate class)
   //         * navigate to this url https://www.saucedemo.com/v1/inventory.html
   //         * add the first item you find to your cart
   //  * open your cart*
   //         * assert that the item name is correct inside the cart
   //  */
//

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){

        driver = new ChromeDriver();
        driver.get("hhttps://www.saucedemo.com/v1/inventory.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
@Test
public void task1(){
        driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory'][1]")).click();







}





}
