package day06;

import com.github.javafaker.Faker;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class emirChallenge3 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
    }
    @AfterClass
    public static void tearDown (){
        //driver.quit();
    }


@Test
    public void challenge(){
    WebElement email = driver.findElement(By.id("email"));
    email.click();
    email.sendKeys("ziad@gmail.com");
    WebElement pass = driver.findElement(By.id("password"));
    pass.click();
    pass.sendKeys("1234567");
     driver.findElement(By.id("submit")).click();

     WebElement addContact = driver.findElement(By.id("add-contact"));
    Assert.assertTrue(addContact.isDisplayed());
    addContact.click();

     WebElement fname = driver.findElement(By.id("firstName"));
    Faker faker = new Faker();
    String firstname = faker.name().firstName();
    fname.sendKeys(firstname);

    WebElement lname = driver.findElement(By.id("lastName"));
    String lastName = faker.name().lastName();
    lname.sendKeys(lastName);
    //
    WebElement birth = driver.findElement(By.id("birthdate"));
  //  String birthdate = faker.date().birthday().toString();
    birth.sendKeys("1999-07-11");

    WebElement emaill = driver.findElement(By.id("email"));
    emaill.sendKeys("z2@gmail.com");

    WebElement phone = driver.findElement(By.id("phone"));
    phone.sendKeys("1234567890");

    WebElement street1 = driver.findElement(By.id("street1"));
    street1.sendKeys("saud bin abdulmohsen");

    WebElement street2 = driver.findElement(By.id("street2"));
    street2.sendKeys("DD");

    WebElement stateProvince = driver.findElement(By.id("stateProvince"));
    stateProvince.sendKeys("Hail");

    WebElement postalCode = driver.findElement(By.id("postalCode"));
    postalCode.sendKeys("55555");

    WebElement country = driver.findElement(By.id("country"));
    country.sendKeys("KSA");

    driver.findElement(By.id("submit")).click();
    //WebElement emailVerf = driver.findElement(By.xpath("(//*[contains(text(),'ziadry3@gmail.com')])"));
    WebElement emailVerf = driver.findElement(By.xpath("(//*[contains(text(),'Contact Details')])"));
    Assert.assertTrue(emailVerf.isDisplayed());
    //Assert.assertTrue(emailVerf.isDisplayed());


    //email phone street1 street2 city  stateProvince   postalCode  country

}

}
