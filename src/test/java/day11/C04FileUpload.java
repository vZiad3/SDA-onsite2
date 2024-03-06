package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04FileUpload extends TestBase {

    @Test
    public void test(){
        String userDir = System.getProperty("user.dir");
        String sep = System.getProperty("file.separator");
        String fileName = "FileExist";

        String pathOfFile = userDir + sep + fileName;

     //  Go to URL: https://the-internet.herokuapp.com/upload
        driver.get("https://the-internet.herokuapp.com/upload");

     //  Find the path of the file that you want to upload.

        WebElement choseFile = driver.findElement(By.id("file-upload"));                // this kind of page u cant click on the button , just send keys on it
        choseFile.sendKeys(pathOfFile);

        //choseFile.click();
        driver.findElement(By.id("file-submit")).click();
        //choseFile.sendKeys(pathOfFile);
     //          Click on Upload button.
     //          Verify the upload message.

    }

}
