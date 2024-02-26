package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03NavigationCommands {

    public static void main(String[] args) {


        // Creating a WebDriver object

        WebDriver driver = new ChromeDriver();

        // Opening Google website
        driver.get("https://www.google.com");
        // Opening clarusway website
        driver.get("https://clarusway.com/");

        // NAVIGATION COMMANDS


        // back() opens the previous page
        System.out.println("Driver.getCurrent" + driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("title of the page is : " + driver.getTitle());

        // forward() opens the next page after going back
        driver.navigate().forward();
        System.out.println("CurrentURL: " + driver.getCurrentUrl());

        // refresh() refreshes the page

        driver.navigate().refresh();

        // to() - performs the same function as the get() method

        driver.navigate().to("https://amazon.com/");

        System.out.println("Current URL is : " + driver.getCurrentUrl());

        driver.close();

    }
}
