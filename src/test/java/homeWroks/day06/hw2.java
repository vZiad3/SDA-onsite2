package homeWroks.day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class hw2 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
    }
    @AfterClass
    public static void tearDown (){
        //driver.quit();
    }
    @Test
    public void task2(){

        //Select the Old Style Select Menu using the element id.
        WebElement oldStyle = driver.findElement(By.id("oldSelectMenu"));

        //Print all the options of the dropdown.
        Select select = new Select(oldStyle);      // We select the options and we store it in List so we can get the options and we can use for each so we can print it
        List<WebElement> options = select.getOptions();

        for (WebElement getOpt : options){
            System.out.println("The name of the value is:  " + getOpt.getText());
        }


        //        Select 'Purple' using the index.
        select.selectByIndex(4);                         // by Purple and Purple is text which means ==>

        //After that, select 'Magenta' using visible text.
        select.selectByVisibleText("Magenta");                         // by Purple and Purple is text which means ==>

        //Select an option using value.
        select.selectByValue("2");

        //Close the browser.

        //driver.close();








    }






    //Task:2
  //Launch the browser.
  //        Open "https://demoqa.com/select-menu".
  //Select the Old Style Select Menu using the element id.
  //Print all the options of the dropdown.
  //        Select 'Purple' using the index.
  //After that, select 'Magenta' using visible text.
  //Select an option using value.
  //Close the browser.
}
