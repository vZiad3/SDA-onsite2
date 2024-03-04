package homeWroks.day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;

public class hw2 extends TestBase {

        @Test
        public void horizontalTest(){
            By slider= By.id("js-rangeslider-0");

            //  Go to URL: https://rangeslider.js.org/
            driver.get("https://rangeslider.js.org/");

            //  Shift 100 units to the right and 100 units to the left on the horizontal axis.

            WebElement sliderButton = driver.findElement(slider);
            actions
                    .dragAndDropBy(sliderButton,100,0)          // opisite -32 means up
                    .pause(Duration.ofSeconds(2))
                    .dragAndDropBy(sliderButton,-100,0)
                    .build()        // it will build both and send them (perform)
                    .perform();
        }
    }




