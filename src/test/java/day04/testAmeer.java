package day04;


    import org.junit.After;
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Test;
import java.time.Duration;

public class testAmeer {

        WebDriver driver;
@After
public void aftert(){
    driver.quit();
}
        @Test
        public void task5() throws InterruptedException {

            driver = new ChromeDriver();
            System.out.println("Browser is opened");

            driver.get("https://automationexercise.com/");
            System.out.println("Homepage is visible successfully");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Assert that the browser is open
            Assert.assertTrue("Browser is not open", driver != null);

            // Check if login button is displayed
            WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
            Assert.assertTrue("Login button is not displayed", loginButton.isDisplayed());
            loginButton.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Print "Browser is opened" and check the current URL
            Assert.assertTrue("URL is not as expected", driver.getCurrentUrl().equals("https://automationexercise.com/"));

            System.out.println("Login to your account’ is visible");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebElement login = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            driver.findElement(By.name("email")).sendKeys("sda@test.com");
            driver.findElement(By.name("password")).sendKeys("sdainclasstask");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            loginButton.click();

            driver.quit();
        }
}