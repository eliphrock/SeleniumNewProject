package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_WebDriverManager {

    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver","./src/recources/drivers/chromedriver");
       // we no longer need to use system.setproperty. we can use webdrivermanager api.

        WebDriverManager.chromedriver().setup();

        //rest is the same
        //create driver
        WebDriver driver=new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //going to page
        driver.get("https://www.techproeducation.com");
        //close
        driver.quit();
    }
}
