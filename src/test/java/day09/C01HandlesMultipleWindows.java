package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Iterator;
import java.util.Set;

public class C01HandlesMultipleWindows extends TestBase {
    @Test
    public void test(){

        //  Go to URL: https://demoqa.com/browser-windows
        driver.get("https://demoqa.com/browser-windows");

      //  Click on the windows - "WindowButton"
        By tabElement = By.id("tabButton");
        By windoElement = By.id("windowButton");
        By messageElement = By.id("messageWindowButton");

      //  Click on all the child windows.
        driver.findElement(tabElement).click();
        driver.findElement(windoElement).click();
        driver.findElement(messageElement).click();

    //  Print the text present on all the child windows in the console.
        Set<String> handlesList = driver.getWindowHandles();        
        Iterator<String> itr = handlesList.iterator();
        
      //  Print the heading of the parent window in the console.
        String handleMain = itr.next();
        String handleTab = itr.next();                  // next() will move the cursor to the next element
        String handleindMessage = itr.next();

        System.out.println("handleMain = " + handleMain);
        System.out.println("handleTab = " + handleTab);
        System.out.println("handleindMessage = " + handleindMessage);
      //
        //  Print the heading of the parent window in the console.
            driver.switchTo().window(handleTab);        //
            System.out.println("message of the tap is :" +driver.findElement(messageElement).getText());

    }
}
