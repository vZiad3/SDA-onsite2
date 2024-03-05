package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.JScriptUtilities;
import utilities.TestBase;

public class C02JavaScriptExecutor02 extends TestBase {
    /*
    Go to URL: https://api.jquery.com/dblclick/
    Double click on the blue square at the bottom of the page
    Write the changed color on search box on the top of the page
    Click "jQuery in Action" at the bottom of the page.

     */
    @Test
    public void test(){

        driver.get("https://api.jquery.com/dblclick/");
        //switch to another frame
        driver.switchTo().frame(0);
        WebElement colouredButton =driver.findElement(By.cssSelector("body>div"));

        JScriptUtilities.scrollIntoViewJS(driver,colouredButton);

        actions
                .doubleClick(colouredButton)
                .perform();

        String colorCode = colouredButton.getCssValue("background-color");
        //return to the main page
        driver.switchTo().defaultContent();

        JScriptUtilities.scrollAllUpByJS(driver);

        // write on the search the color
        driver.findElement(By.name("s")).sendKeys(colorCode);


        // click on the book
        JScriptUtilities.scrollDownByJS(driver);
        driver.findElement(By.xpath("//a[@href = 'https://www.manning.com/books/jquery-in-action-third-edition']")).click();

    }
}