package day08;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02IFrames02 {
    /*
    Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/.
    Maximize the website.
    Click on the second emoji.
    Click on all second emoji items.
    Return to the parent iframe.
    Fill out the form (Fill the form with the text you want) and press the apply button.

     */

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test() {

        //Go to URL: https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        driver.switchTo().frame("emoojis");
        By animalEmoj = By.id("tooltip-ijtzo8");
        driver.findElement(animalEmoj).click();

        driver.switchTo().defaultContent();        // We use this when we have  one above it
        driver.findElement(By.id(""));
        List<WebElement> emojiess = driver.findElements(By.xpath(""));








    }
}