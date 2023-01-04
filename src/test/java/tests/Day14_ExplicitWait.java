package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Day14_ExplicitWait extends TestBase {

    @Test
    public void explicitWaitTest(){
//        Go to https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//        When user clicks on the Start button
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
//        Then verify the ‘Hello World!’ Shows up on the screen

        //this piece of code fails cause implicit wait is not able to handle the element
        //solution : try explicit wait or fluent wait
//
//        WebElement helloElement = driver.findElement(By.id("finish"));
//        Assert.assertEquals("Hello World!",helloElement.getText());

        //1.create webdriver object
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        //2.use wait object to handle synchronization issue(wait issue)
        //*waits for the xpath to be visible UP TO !0 SECONDS
        //*returns the web element
        //*if the element is not found within 10 seconds,the throw time out exception
      WebElement helloElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
      Assert.assertEquals("Hello World!",helloElement.getText());
    }
}
