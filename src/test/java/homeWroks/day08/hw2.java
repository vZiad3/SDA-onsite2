package homeWroks.day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.Iterator;
import java.util.Set;

public class hw2 extends TestBase {
    @Test
    public void test() throws InterruptedException {
     //   Go to URL: https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");


     //   Verify the text: “Opening a new window”
        WebElement openingMessage = driver.findElement(By.xpath("//*[.='Opening a new window']"));
        Assert.assertTrue(openingMessage.isDisplayed());

     //   Verify the title of the page is “The Internet”
        String title = driver.getTitle();
        System.out.println("title of the main page  = " + title);
        Assert.assertTrue(title.equals("The Internet"));


     //   Click on the “Click Here” button
        WebElement newTap = driver.findElement(By.xpath("//*[.='Click Here']"));
        newTap.click();


        //Get name of the new handle so we can switch between them
        Set<String> handlesList = driver.getWindowHandles();
        Iterator<String> itr = handlesList.iterator();

        String mainTabNameUsingItr = itr.next();
         String secTabNameUsingItr = itr.next();


        System.out.println("mainTabNameUsingItr = " + mainTabNameUsingItr);
        System.out.println("Second TabNameUsingItr = " + secTabNameUsingItr);
        Thread.sleep(3000);
        driver.switchTo().window(secTabNameUsingItr);

        //   Verify the new window title is “New Window”
        String secondPageTitle = driver.getTitle();
        System.out.println("secondPageTitle = " + secondPageTitle);
        Assert.assertTrue(secondPageTitle.equals("New Window"));


     //   Go back to the previous window and then verify the title: “The Internet”
        driver.switchTo().window(mainTabNameUsingItr);
        //Welcome message of the main page
        WebElement newWindoMessgae = driver.findElement(By.xpath("//div[@class='example']"));
        Assert.assertTrue(newWindoMessgae.isDisplayed());

    }
}
