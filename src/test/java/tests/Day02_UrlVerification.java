package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_UrlVerification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./src/recources/drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.techproeducation.com/");

        //verify if techproeducation homepage url is "https://www.techproeducation.com"

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://techproeducation.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ActualUrl is :"+actualUrl);
            System.out.println("But Expected Url :"+expectedUrl);
        }
        driver.quit();
    }
}
