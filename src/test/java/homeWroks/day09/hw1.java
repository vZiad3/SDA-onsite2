package homeWroks.day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class hw1 extends TestBase {
    @Test
    public void test() {}
     {
        By bank =By.id("credit2");
        By account = By.id("bank");
        By tableLeft = By.id("table4");
        By sales = By.id("credit1");
        By accountCredit = By.id("loan");
        By fiveThous = By.id("fourth");
        By amountDept = By.id("amt7");
        By amountCred = By.id("amt8");
        //By amountCred = By.id("amt8");



      //  Go to URL: http://demo.guru99.com/test/drag_drop.html
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement bankElement = driver.findElement(bank);
        WebElement accountElement = driver.findElement(account);
        WebElement tableElement = driver.findElement(tableLeft);
        WebElement accountCreditElement = driver.findElement(accountCredit);
        WebElement salesElement = driver.findElement(sales);
        WebElement fivethousElement = driver.findElement(fiveThous);
        WebElement amountDeptElement = driver.findElement(amountDept);
        WebElement amountcreditElement = driver.findElement(amountCred);

      //  Drag and drop the BANK button to the Account section in DEBIT SIDE
actions
        .dragAndDrop(bankElement,accountElement)
        .perform();
      //  Drag and drop the SALES button to the Account section in CREDIT SIDE
        actions
                .dragAndDrop(salesElement,accountCreditElement)
                .perform();

      //  Drag and drop the 5000 button to the Amount section in DEBIT SIDE
       actions
               .dragAndDrop(fivethousElement,amountDeptElement)
               .perform();
      //  Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
        actions
                .dragAndDrop(fivethousElement,amountcreditElement)
                .perform();
      //  Verify the visibility of Perfect text.
         WebElement verify = driver.findElement(By.id("equal"));
         Assert.assertTrue(verify.isDisplayed());



    }
}
