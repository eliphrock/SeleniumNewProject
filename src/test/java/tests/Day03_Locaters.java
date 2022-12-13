package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03_Locaters {

    /*
        Create a class : LocatorsIntro 
        Create test method locators


        Enter below username and password then click sign in button 
        Username :  testtechproed@gmail.com 
        Password : Test1234! 
        Then verify that the expected user id  testtechproed@gmail.com (USE getText() method to get the text from the page)
        Verify the Addresses and Sign Out  texts are displayed
        Find the number of total link on the page
        Sign out from the page
     */
    @Before
    @Test
    public void logIn(){

        //user goes to http://a.testaddressbook.com/sign_in
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      //Locate the elements of email textbox, password textbox, and signin button
        WebElement username=driver.findElement(By.name("username"));//location username by name
        username.sendKeys("Admin");//typing Admin
        //locating the password and typing
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        //locating the button and clicking
        WebElement button=driver.findElement(By.tagName("button"));
        button.click();


    }
}
