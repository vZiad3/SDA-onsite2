package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class seleinumHW1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        /*

Close/Quit the browser
     */
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("title is :  " + title);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        String currURL = driver.getCurrentUrl();
        System.out.println("currURL is :   " + currURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        driver.close();
        driver.quit();
    }
}
