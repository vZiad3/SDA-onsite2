package homeWroks.day11;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class hw1 extends TestBase {
    @Test
    public void facebookTask(){
   //    Go to URL: http://facebook.com
   //    getCookies,
   //            addCookie,
   //            deleteCookieNamed,
   //            deleteAllCookies.


        //    Go to URL: http://facebook.com
        driver.get("http://facebook.com");
        //    getCookies,
        Set<org.openqa.selenium.Cookie> allCookies = driver.manage().getCookies();
        for (Cookie w : allCookies){
            System.out.println("all the cookies are: "+ w);
        }

        //            addCookie,
        Cookie newCookie = new Cookie("Car","Audi");
        driver.manage().addCookie(newCookie);
        System.out.println("allCookies = " + allCookies);

        //            deleteCookieNamed,
        driver.manage().deleteCookie(newCookie);
        //System.out.println(allCookies);

        //            deleteAllCookies.
        System.out.println("\n --------- \n");
        driver.manage().deleteAllCookies();
        driver.manage().getCookies().forEach(cookiesAll-> System.out.println("allCookies = " + allCookies));
        System.out.println("Nothing is here ");



    }
}
