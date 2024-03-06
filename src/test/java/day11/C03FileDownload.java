package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;

public class C03FileDownload extends TestBase {
    @Test
    public void test(){
        //    Go to URL: https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");

        //    Download selenium-snapshot.png
        driver.findElement(By.xpath("//*[.='selenium-snapshot.png']")).click();
        String sepertor = System.getProperty("file.separator");


        //  Verify if the file downloaded successfully  .
        //  2- adding(" user.home" ) to differentiaiate the user name if u want to share it3- // we need to add the name of the file
        //you can check the file info to know the details about the commands

        String pathOfFile = System.getProperty("user.home") +sepertor+ "Downloads" + sepertor + "selenium-snapshot.png";
        boolean isFilesDownCheck = Files.exists(Path.of(pathOfFile));
        Assert.assertTrue(isFilesDownCheck);
    }
}
