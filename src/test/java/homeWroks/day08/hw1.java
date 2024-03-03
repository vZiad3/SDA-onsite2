package homeWroks.day08;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class hw1 extends TestBase {
    @Test
    public void task1() throws InterruptedException {
     //  Go to URL: http://demo.guru99.com/test/guru99home/
        driver.get("http://demo.guru99.com/test/guru99home/");
        String handle = driver.getWindowHandle();

     //  Find the number of iframes on the page.
        List<WebElement> iframesNum = driver.findElements(By.tagName("iframe"));
        System.out.println("iframesNum.size() = " + iframesNum.size());

        //  Link to the third iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
       driver.switchTo().frame("a077aa5e");
       driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
       Thread.sleep(3000);
     //  Exit the iframe and return to the main page.
        driver.switchTo().window(handle);
        driver.switchTo().defaultContent();




    }

}
