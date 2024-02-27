package day05;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class C03CheckboxExercise {

        /*
        Go to URL: https://demoqa.com/
        Click on Elements.
        Click on Checkbox.
        Verify if Home checkbox is selected.
        Verify that "You have selected" is visible.

         */
        static WebDriver driver;
        @BeforeClass
        public static void setUp(){

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }

        @AfterClass
        public static void tearDown(){
            //driver.quit();
        }


        @Test
        public void test() {
            // Go to URL: https://demoqa.com/
            driver.get("https://demoqa.com/");
            // Click on Elements.
            driver.findElement(By.xpath("//*[text()='Elements']")).click();

            // Click on Checkbox.
            driver.findElement(By.id("item-1")).click();

            // Verify  Home checkbox is selected.
            WebElement homeBox = driver.findElement(By.className("rct-title"));
            boolean isSelected = homeBox.isSelected();
            homeBox.click();
            if (isSelected) {
                System.out.println("Selected....");
            } else {
                System.out.println("Not selected...");
            }


            // Verify  Home checkbox if is not  selected.

            // Verify that "You have selected" is visible.
            WebElement message = driver.findElement(By.cssSelector("div#result span"));      // CSS selector
            Assert.assertTrue(message.isDisplayed());

        }

        }









