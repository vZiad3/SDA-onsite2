package homeWroks.day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hw3 {
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






 // Task:3
 // Launch the browser.
 //         Open "https://demoqa.com/select-menu".
 // Select the Standard Multi-Select using the element id.
 // Verifying that the element is multi-select.
 //         Select 'Opel' using the index and deselect the same using index.
 //         Select 'Saab' using value and deselect the same using value.
 // Deselect all the options.
 // Close the browser.
}
