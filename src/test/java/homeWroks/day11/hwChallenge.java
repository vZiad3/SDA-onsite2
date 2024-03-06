package homeWroks.day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.JScriptUtilities;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class hwChallenge extends TestBase {

    // Test method to verify downloading a file
    @Test
    public void page() throws InterruptedException {
        // Open the webpage
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Set up wait for elements to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Find username field, input username, and wait for visibility
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.click();
        userName.sendKeys("Admin");
        wait.until(ExpectedConditions.visibilityOf(userName));

        // Find password field, input password
        WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
        passWord.click();
        passWord.sendKeys("admin123");

        // Click on login button
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        // Navigate to PIM section
        driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][.='PIM']")).click();

        // Click on Configuration and select Data Import
        driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']")).click();
        WebElement dataImport = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link'][.='Data Import']"));
        JScriptUtilities.clickElementByJS(driver,dataImport);

        // Wait for download link to appear
        // driver.findElement(By.className("download-link")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("download-link")));

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
