package day03;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise {

    //task01:
    //Create the driver with BeforeClass and make it static inside the class.
    //Go to http://www.google.com
    //Type "Green Mile" in the search box and print the number of results.
    //Type "Premonition" in the search box and print the number of results.
    //Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
    //Close with AfterClass.



    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }
    @After


    @Test
    public void typing(){
      WebElement placeholder = driver.findElement(By.className("gLFyf"));
        String entery1 = "Green Mile";
        placeholder.sendKeys(entery1);
        System.out.println("The reslut of the entery is : " +entery1 );



    }
}
