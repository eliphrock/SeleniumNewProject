package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_LinkTexts {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @Test
    public void LMSPage(){
        driver.get("https://techproeducation.com/");
        //Click on LMS LOGIN
        //lms login is a link
        //text of that link is "lms login"
        driver.findElement(By.linkText("LMS LOGIN")).click();

    }
    @Test
    public void LMSPagePartial(){
        driver.get("https://techproeducation.com/");
        //Click on LMS LOGIN
        //lms login is a link
        //text of that link is "lms login"
        driver.findElement(By.partialLinkText("LMS L")).click();

    }
}
