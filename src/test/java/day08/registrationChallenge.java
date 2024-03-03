package day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class registrationChallenge extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");
        //Locating iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe[@aria-label='SDA Iframe Test']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@class='fmSmtButton submitColor submitWrapper fmSmtButtom']")).click();

        //Verify the error message when leaving First name  || Last name empty
        WebElement nameError = driver.findElement(By.id("error-Name"));
        Assert.assertTrue(nameError.isDisplayed());

        //Insert Fname
        WebElement fName = driver.findElement(By.xpath("//*[@aria-labelledby='Name-arialabel aria-showelemslabel-Name0 ariarequired-Name0']"));
        fName.sendKeys("Ziad");

        //insert Lname
        WebElement lName = driver.findElement(By.xpath("//*[@aria-labelledby='Name-arialabel aria-showelemslabel-Name1 ariarequired-Name1']"));
        lName.click();
        lName.sendKeys("alsh");


        //Click radioButton the First button of the radiobutton
        WebElement radioButton = driver.findElement(By.xpath("//*[@class='radioChoice cusChoiceLabel']//em[.='First Choice']"));
        radioButton.click();

        //Verify radio button
        Assert.assertTrue(radioButton.isDisplayed());

        //Verify the error message when leaving Drop down empty
        WebElement dropError = driver.findElement(By.id("error-Dropdown"));
        Assert.assertTrue(dropError.isDisplayed());

        //DROP DOWN select
        WebElement dropDown = driver.findElement(By.id("Dropdown-arialabel"));
        Select select = new Select(dropDown);
        select.selectByValue("Second Choice");


        //Verify the not editable field
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
        WebElement checkChoise = driver.findElement(By.xpath(" //*[@id='Checkbox-li']//*[contains(text(),'Second Choice')]"));
        checkChoise.click();

        //Verify check box
        Assert.assertNotNull("its null",checkChoise.isSelected());


        //Click on rating
        List<WebElement> ratingList = driver.findElements(By.xpath("//*[@aria-describedby='Rating-arialabel hint-Rating']"));
        ratingList.get(3).click();
        //  WebElement rating = driver.findElement(By.xpath(" //*[@aria-label='3 Star']"));
        //rating.click();

        WebElement ratingCheck = driver.findElement(By.xpath("//*[@role='radio'][@class='ON']"));
        Assert.assertEquals(ratingList,ratingCheck);

        driver.findElement(By.xpath("//*[@class='fmSmtButton submitColor submitWrapper fmSmtButtom']")).click();

        //   driver.findElement(By.xpath("//*[@class='fmSmtButton submitColor submitWrapper fmSmtButtom']")).click();

        //*[@aria-labelledby='Name-arialabel aria-showelemslabel-Name1 ariarequired-Name1']





    }






}


