package homeWroks.day11;

import org.junit.Assert;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;

public class hw2 extends TestBase {
    public static void main(String[] args) {
//
   //     Create a File on Desktop


        String userHome = System.getProperty("user.home");
        String sep = System.getProperty("file.separator");
        String fileName = "testFileIfExist";
        String pathOfTheFile = userHome + sep + "Desktop" + sep + fileName;
        System.out.println("pathOfTheFile = " + pathOfTheFile);

        //     Verify that the file exists
        boolean isExist = Files.exists(Path.of(pathOfTheFile));
        Assert.assertTrue(isExist);
        System.out.println("isExist = " + isExist);





    }

}
