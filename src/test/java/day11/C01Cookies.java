package day11;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C01Cookies extends TestBase {
    //Go to URL: https://kitchen.applitools.com/ingredients/cookie
    //Print all the cookies.
    //Get Cookie.
    //Find the total number of cookies.
    //Add Cookie.
    //Edit Cookie.
    //Delete Cookie.
    //Delete All Cookies.
    @Test
    public void test(){

        //Go to URL: https://kitchen.applitools.com/ingredients/cookie
        driver.get("https://kitchen.applitools.com/ingredients/cookie");

        //Print all the cookies.
        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie w : cookies){
            System.out.println(w);
        }

        //Get Cookie.
        Cookie cookieName = driver.manage().getCookieNamed("protein");
        System.out.println("\ncookieName = " + cookieName);

        //Find the total number of cookies.
        int sizeOfCookies = cookies.size();

        //Add Cookie.
        Cookie newCookie = new Cookie("fruit","mango");
        driver.manage().addCookie(newCookie);
        //Edit Cookie.

        //Delete Cookie.
        driver.manage().deleteCookie(newCookie);
        //Delete All Cookies.
        System.out.println("--\n");
        driver.manage().deleteAllCookies();
        driver.manage().getCookies().forEach(System.out::println);
        System.out.println("end here");


    }
}
