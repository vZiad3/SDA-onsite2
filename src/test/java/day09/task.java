package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class task extends TestBase {
    @Test
    public void task(){
        By country1 = By.id("DHTMLgoodies_dragableElement0");
        By country2 = By.id("box3");
        By countries = By.id("countries");

       // Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(driver);
        WebElement country11 = driver.findElement(country1);
        WebElement country22 = driver.findElement(country2);
        WebElement countriesE = driver.findElement(countries);

        actions
                .dragAndDrop(country22,countriesE)
                .perform();
       // Fill in capitals by country.






    }
}
