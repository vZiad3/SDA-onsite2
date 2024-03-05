package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.JScriptUtilities;
import utilities.TestBase;

public class C02JavaScriptExecutor02 extends TestBase {
  // Go to URL: https://api.jquery.com/dblclick/
  // Double click on the blue square at the bottom of the page and then write the changed color.
    @Test
    public void test(){
        driver.get("https://api.jquery.com/dblclick/");
        WebElement iframe = driver.findElement(By.cssSelector("body>div"));
        JScriptUtilities.scrollIntoViewJS(driver,iframe);
        driver.switchTo().frame(iframe);
        WebElement colourButt = driver.findElement(By.xpath("//span[.='Double click the block']/preceding-sibling::div"));
        String colorName = colourButt.getCssValue("back-ground-color");
        actions
                .doubleClick(colourButt)
                .perform();


    }
}
