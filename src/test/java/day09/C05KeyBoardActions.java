package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C05KeyBoardActions extends TestBase {
    @Test
    public void keyBoardTest(){
        By boxId = By.id("autoCompleteMultipleContainer");
        driver.get("https://demoqa.com/auto-complete");
        WebElement textBox = driver.findElement(boxId);

actions
        .click(textBox)
        .keyDown(Keys.SHIFT)
        .sendKeys("e")
        .keyUp(Keys.SHIFT)
        .sendKeys("xceptional")
        .perform();






    }
}
