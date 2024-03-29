package homeWroks.day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.JScriptUtilities;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class hw3Challenge extends TestBase {

    // Test method to verify downloading a file
    @Test
    public void page() throws InterruptedException {

        //Declaring variables, so we can use it and it should be more readable
        By userName = By.xpath("//input[@name='username']");
        By passWord = By.xpath("//input[@name='password']");
        By dataImpEle = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link'][.='Data Import']");

        // Open the webpage
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Set up wait for elements to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Find username field, input username, and wait for visibility
        WebElement userNameEle = driver.findElement(userName);
        userNameEle.click();
        userNameEle.sendKeys("Admin");

        wait.until(ExpectedConditions.visibilityOf(userNameEle));

        // Find password field, input password
        WebElement passWordEle = driver.findElement(passWord);
        passWordEle.click();
        passWordEle.sendKeys("admin123");

        // Click on login button
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        // Navigate to PIM section
        //driver.findElement(By.xpath("//*[.='PIM']")).click();
        driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][.='PIM']")).click();

        // Click on Configuration and select Data Import
        driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']")).click();
        WebElement dataImportEle = driver.findElement(dataImpEle);
        JScriptUtilities.clickElementByJS(driver,dataImportEle);

        // Wait for download link to appear
        // driver.findElement(By.className("download-link")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("download-link")));

        //After downloading the CSV, i am going to use Thread sleep by java because the download speed , so the PC can locate it

        Thread.sleep(2000);         //Not recommended, but  its the only way to stop the whole code

        // Define path for the downloaded file
        String userHomeC = System.getProperty("user.home");
        String seprator = System.getProperty("file.separator");
        String nameOfTheDownloadedFile ="importData.csv";

        String pathOfDonloadedFile = userHomeC + seprator + "Downloads" + seprator +nameOfTheDownloadedFile;

        System.out.println("pathOfDonloadedFile = " + pathOfDonloadedFile);

        // Check if file exists
        boolean isDownloaded = Files.exists(Path.of(pathOfDonloadedFile));

        // Assert that file if  it's downloaded successfully
        Assert.assertTrue(isDownloaded);
        System.out.println("isDownloaded = " + isDownloaded);

    }
}
