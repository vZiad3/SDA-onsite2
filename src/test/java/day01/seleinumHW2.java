package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class seleinumHW2 {
    public static void main(String[] args) {
    /*
Invoke Chrome Driver
Navigate to Facebook homepage URL: https://www.facebook.com/
Verify expected URL equals to the actual URL.
Verify  pagesource of FaceBook contains "Facebook" .
     */

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
     driver.get("https://www.facebook.com");
     String expectedRes =  "https://www.facebook.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        String actualRes = driver.getCurrentUrl();
        String current = driver.getCurrentUrl();
        System.out.println("current = " + current);

        if(expectedRes.equals(actualRes)){                                 //it will check if the expected page is same as the actual
         System.out.println("The page is the same ");
     }
     else {
         System.out.println("the page is Not the same as expected");
     }



     if (driver.getPageSource().contains("Facebook")){                      // it will check if the page contains "faceBook"

         System.out.println("The page source of Facebook contains 'Facebook'.");
     } else {
         System.out.println("The page source of Facebook does not contain 'Facebook'.");
     }


        driver.close();
        driver.quit();


    }

}
