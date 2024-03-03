package day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class registrationChallenge extends TestBase {

    @Test
    public void test1(){
        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");
        //Locating iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe[@aria-label='SDA Iframe Test']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@class='fmSmtButton submitColor submitWrapper fmSmtButtom']")).click();

        //Insert Fname
        WebElement fName = driver.findElement(By.xpath("//*[@aria-labelledby='Name-arialabel aria-showelemslabel-Name0 ariarequired-Name0']"));
        fName.click();
        fName.sendKeys("Ziad");

        //insert Lname
        WebElement lName = driver.findElement(By.xpath("//*[@aria-labelledby='Name-arialabel aria-showelemslabel-Name1 ariarequired-Name1']"));
        lName.click();
        lName.sendKeys("alsh");

        //Click radioButton the First button of the radiobutton
        driver.findElement(By.xpath("//*[@class='radioChoice cusChoiceLabel']//em[.='First Choice']")).click();

        //DROP DOWN
    WebElement dropDown = driver.findElement(By.id("Dropdown-arialabel"));
        Select select = new Select(dropDown);
        select.selectByValue("Second Choice");


      try {
          // THE FIELD ISNT EDITABLE
          WebElement notEditable = driver.findElement(By.id("SingleLine-arialabel"));
          notEditable.sendKeys("33");

          Assert.fail("The field is editable, but it shouldn't be");
          //String not = notEditable.getAttribute("true");
          //Assert.as(not);

      }catch (Exception e){
          Assert.assertTrue(true);
      }

      //Clicking on Check box

        driver.findElement(By.xpath(" //*[@id='Checkbox-li']//*[contains(text(),'Second Choice')]")).click();

        WebElement rating = driver.findElement(By.xpath(" //*[@aria-label='3 Star']"));
        rating.click();

        driver.findElement(By.xpath("//*[@class='fmSmtButton submitColor submitWrapper fmSmtButtom']")).click();

        //*[@aria-labelledby='Name-arialabel aria-showelemslabel-Name1 ariarequired-Name1']










    }






}
