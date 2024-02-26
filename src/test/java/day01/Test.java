package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); // Declare WebDriver
        driver.get("https://www.google.com");
        driver.get("https://www.amazon.com");
        driver.getTitle();
        driver.getCurrentUrl();
        //driver.getPageSource();




    }


}
