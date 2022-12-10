package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

   // Create main method
    public static void main(String[] args) {
        //Step 1: set up

        System.setProperty("webdriver.chrome.driver","./src/recources/drivers/chromedriver");

        // step 2:  create  //Create chrome driver

        WebDriver driver=new ChromeDriver();

        // step 3: write test scripts

        //Maximize the window
        driver.manage().window().maximize();


        //Open google home page https://www.walmart.com/.
        driver.get("https://www.walmart.com/");


       //On the same class, Navigate to amazon home page https://www.amazon.com/
       // driver.get("https://www.amazon.com/");works
        driver.navigate().to("https://www.amazon.com/");

         //   Navigate back to walmart
        driver.navigate().back();

          //  Navigate forward to amazon
        driver.navigate().forward();
         //   Refresh the page

        driver.navigate().refresh();
          //  Close/Quit the browser
        driver.quit();


    }
}
