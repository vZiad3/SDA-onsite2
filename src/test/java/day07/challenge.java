package day07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class challenge {
    static WebDriver driver;


    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


    }

    @AfterClass
    public static void tearDown() {
        //driver.quit();
    }


   //Thread
   //implicity
   //wait;
   //explict
   //fleunt
    @Test
    public void waitTask() throws InterruptedException {
        driver.findElement(By.id("alert")).click();             // we click the button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));      // Now we gonna wait 5 sec
        wait.until(ExpectedConditions.alertIsPresent());      // we wait until the Alert is present so we can continue to the next lines
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
    @Test
    public void waitTask2() throws InterruptedException {
        //click on "Change Text to Selenium Webdriver"
        driver.findElement(By.id("populate-text")).click();

        WebElement msg = driver.findElement(By.xpath("//h2[@id='h2']"));

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait2.until(ExpectedConditions.visibilityOf(msg));

        //verify "Selenium Webdriver" message is displayed
        boolean selWeb = msg.isDisplayed();
        Assert.assertTrue(selWeb);
        String verf = msg.getText();
        System.out.println(verf);


        //Click
       driver.findElement(By.id("populate-text")).click();

       WebElement oldMessage = driver.findElement(By.id("h2"));
        System.out.println("oldMessage : " + oldMessage);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));      // Now we gonna wait +10 sec

       // wait.until(ExpectedConditions.visibilityOf(oldMessage));
        WebElement newMess = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='h2']")));
                //driver.findElement(By.partialLinkText("Selenium Webdriver"));
        Thread.sleep(10000);
        System.out.println(newMess.getText());
        Assert.assertTrue(newMess.isDisplayed());


        //WebElement h2 = driver.findElement(By.id("h2"));
       //wait.until(ExpectedConditions.invisibilityOf("Selenium Webdriver"));

       //System.out.println("h2.getText() = " + h2.getText());
       //Assert.assertTrue(h2.equals("Selenium Webdriver"));


    }

    @Test
    public void waitTask3()  {
        // the button is hidden, and when i click on the blue button it should apear
        driver.findElement(By.id("display-other-button")).click();             // we click the button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));      // Now we gonna wait 10 sec
        WebElement buttonVis = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));      // we wait until the Alert is present so we can continue to the next lines
        driver.findElement(By.id("hidden")).click();
        Assert.assertTrue(buttonVis.isDisplayed());


    }
    @Test
    public void waitTask4()  {
        //Button should be clickable after 10 sec
        driver.findElement(By.id("enable-button")).click();             // we click the button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));      // Now we gonna wait 10 sec
        WebElement buttonSelc = wait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
        driver.findElement(By.id("disable")).click();
        Assert.assertTrue(buttonSelc.isEnabled());          // the button can be clicked


    }
    @Test
    public void waitTask5Radio()  {
        //Button should be clickable after 10 sec
        driver.findElement(By.id("checkbox")).click();             // we click the button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));      // Now we gonna wait 10 sec
        Boolean checkBox = wait.until(ExpectedConditions.elementToBeSelected(By.id("ch")));
        driver.findElement(By.id("ch")).click();
        Assert.assertTrue(checkBox);          // the CheckBox radio  can be selected


    }


}

/*

Thank you for the amazing learning techniques Mr.Suleyman & Mr.Emir, and Cluarsway

*/