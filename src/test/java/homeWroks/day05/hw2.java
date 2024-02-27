package homeWroks.day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void tearDown(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }
@Test
public void task1(){
        //Add item
        WebElement item = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bike Light')]"));
    String compareA = item.getText();


    driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory'][1]")).click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Click cart
        driver.findElement(By.xpath("//*[@data-prefix='fas']")).click();



    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the name in the cart
         WebElement nameOfitem =driver.findElement(By.cssSelector(".inventory_item_name"));
        String compareN2 = nameOfitem.getText();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    //Assert of the name outside cart with inside cart
    Assert.assertEquals(compareA,compareN2);


}





}
