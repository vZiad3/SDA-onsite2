package homeWroks.day06;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class hw1 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    @AfterClass
    public static void tearDown (){
        //driver.quit();
    }

    @Test
    public void task1(){

        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);

        // Select Option 1 using index .
        select.selectByIndex(1);

        // Select Option 2 by value.
        select.selectByValue("2");

        // Select Option 1 value by visible text.
        select.selectByVisibleText("Option 1");

        // Print all dropdown value.
        List<WebElement> dropValue = select.getOptions();
        for(WebElement options : dropValue ){
            System.out.println("the option now is: " + options.getText());
        }
        // Verify the dropdown has Option 2 text.
        WebElement valueTow = driver.findElement(By.xpath("//*[contains(text(),'Option 2')]"));
        String valueTow2 = valueTow.getText();
        Assert.assertTrue(valueTow2.equals("Option 2"));

        // Print first selected option.

        WebElement valueOne = driver.findElement(By.xpath("//*[contains(text(),'Option 1')]"));
        String valueOne1 = valueOne.getText();

        // Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
        String size= driver.manage().window().getSize().toString();
        int dropDownSize = select.getOptions().size();
        //System.out.println(size);
        System.out.println(dropDownSize);
        Assert.assertEquals("Expected Is Not Equal Actual",3,dropDownSize);


    }

}
