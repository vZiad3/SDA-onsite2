package homeWroks.day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class youtubeTask extends TestBase {
    @Test
    public void youtube(){
        driver.get("https://www.youtube.com/");
        WebElement search = driver.findElement(By.xpath("//*[@id='search-input']//input[@id='search']"));
//        search.sendKeys("moonlight serenade pirates of the caribbean");

        actions
                .click(search)
                .sendKeys(search,"moonlight serenade pirates of the caribbean")
                .sendKeys(Keys.ENTER)
                .perform();

        WebElement pairte = driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/jquJLs0wdFk/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLADFpmEJaZWUCZEi1T3sxrOaV_-ng']"));
        pairte.click();
        WebElement Aassert22 = driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-watch-metadata'][contains(text(),'Pirates of the Caribbean - Soundtrck 09 - Moonligh')]"));
        Assert.assertTrue(Aassert22.isDisplayed());
    }
}
