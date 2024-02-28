package day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ameerChallenge {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){

        driver = new ChromeDriver();
        //Assert.assertTrue();

        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
        String actual = driver.getCurrentUrl();
        String expected = "https://webdriveruniversity.com/To-Do-List/index.html";
        Assert.assertTrue(actual.equals(expected));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void tearDown(){

     //   driver.quit();
    }

    @Test
    public void addToDo(){
        //Add
        WebElement add = driver.findElement(By.id("plus-icon"));
        add.click();
        //Enter values
        WebElement addTask = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
              addTask.sendKeys("Hello World", Keys.ENTER);

              //Mark task
              WebElement checkCompl = driver.findElement(By.xpath("//*[contains(text(),' Hello World')]"));
              checkCompl.click();
              Assert.assertTrue(checkCompl.isDisplayed());

          WebElement deleteTask = driver.findElement(By.xpath("(//i[@class='fa fa-trash'])[3]"));
          deleteTask.click();
          Assert.assertFalse("The task is still there",deleteTask.isDisplayed());


  //     WebElement checkCompl1 = driver.findElement(By.xpath("//li[@xpath='1']"));
  //     checkCompl1.click();



//
      //        if (addTask.isSelected()){
      //            addTask.click();
      //        }
      //        addTask.click();
      //  //WebElement checkComp = driver.findElement(By.xpath("//li[@class='completed']"));
      //  checkComp.click();
      //  Assert.assertTrue(checkComp.isDisplayed());
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //@Test
    //public void deleteTask(){

    }



