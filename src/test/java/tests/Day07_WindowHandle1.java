package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

public class Day07_WindowHandle1 extends TestBase {
    @Test
    public void windowHandleTest() throws InterruptedException {
//        Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows ");
//        Then user verifies the text : “Opening a new window”
        String window1Text = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window",window1Text);
//        Then user verifies the title of the page is “The Internet”
        Assert.assertEquals("The Internet",driver.getTitle());
//        getting the window 1 handle(unique page id)
        String windowHandle=driver.getWindowHandle();
        System.out.println(windowHandle);

//        When user clicks on the “Click Here” button
        driver.findElement(By.linkText("Click Here")).click();
//        Then user verifies the new window title is “New Window”
//        We do testing in a new window so we must switch to that window
//        as of now 2 windows open,use getwindowhandles()to get both ids
        Set<String> getWindowHandles=driver.getWindowHandles();
        System.out.println(getWindowHandles);
        for(String eachHandle : getWindowHandles){//looping through the windows
            if(!eachHandle.equals(windowHandle)){//if we are not in windows 1 (means windows 2)
                driver.switchTo().window(eachHandle);//then switch the window 2
            }
        }
//        at this point driver is switched to windows 2
        String window2Handle=driver.getWindowHandle(); //window 2
//        Then user verifies the text:  “New Window”
        String window2Text=driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("New Window",window2Text);

        Thread.sleep(5000);
//        When user goes back to the previous window and then verifies the title : “The Internet”
        driver.switchTo().window(windowHandle);//switched window 1
        Assert.assertEquals("The Internet",driver.getTitle());

//        Switch back to window 2
        driver.switchTo().window(window2Handle);
        Thread.sleep(5000);
//        Switch back to window 1
        driver.switchTo().window(windowHandle);
        Thread.sleep(5000);
        //        Switch back to window 2
        driver.switchTo().window(window2Handle);
        Thread.sleep(5000);
//        Switch back to window 1
        driver.switchTo().window(windowHandle);


    }
}
