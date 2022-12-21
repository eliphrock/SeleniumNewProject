package tests;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class Day09_Cookies extends TestBase {
    @Test
    public void cookieTest(){
        //-go to amazon and automate the task
        driver.get("https://www.amazon.com");

        //find the total number of cookies
       Set<Cookie> allCookies= driver.manage().getCookies();
       allCookies.size();
       int numOfCookies=allCookies.size();
        System.out.println("Number of cookies:"+ numOfCookies);
        //print all the cookies
        for(Cookie eachCookie: allCookies){
            System.out.println("Cookie ==>>>"+eachCookie);
            System.out.println("Cookie Value ==>>>"+eachCookie);
            System.out.println("Cookie Name ===>>>"+eachCookie.getName());
        }

        // get the cookies by their name

        System.out.println("Cookie Named:"+driver.manage().getCookieNamed("skin"));

        // add new cookie
        Cookie cookie=new Cookie("my-fav-cookie","chocolate-chip");
        driver.manage().addCookie(cookie);
        Set<Cookie> newCookies=driver.manage().getCookies();
        System.out.println("New Number Of Cookie =====>>>>"+newCookies.size());

        //delete cookie by name
        driver.manage().deleteCookieNamed("session-id");
        int lastNumberOfCookies=driver.manage().getCookies().size();
        System.out.println("Last Number Of Cookies ===>"+lastNumberOfCookies);

        //delete all of the cookies
        driver.manage().deleteAllCookies();
        int finalNumOfCookies=driver.manage().getCookies().size();
        System.out.println("Final Number Of Cookies ====>>>"+finalNumOfCookies);

    }
}
