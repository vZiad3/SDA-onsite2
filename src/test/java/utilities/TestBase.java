package utilities;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public abstract class TestBase {        //Abstract class you cant create obj from this class
    protected static WebDriver driver;
    protected static Actions actions;
    @BeforeClass
    public static void setUp() {             // protocted only child class can inherit it
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().maximize();
    actions = new Actions(driver);
    }

    @AfterClass
    public static void tearDown(){
       // driver.quit();
    }

}
