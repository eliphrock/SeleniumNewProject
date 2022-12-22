package practices02;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Q03 extends TestBase {

    @Test
    public void test3(){

       // Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"

        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

      // Click "CLICK ME" of JavaScript Alert
        driver.findElement(By.id("button1")).click();

        //Get the pop-up text
       String alerttext= driver.switchTo().alert().getText();

       // Verify that message is "I am an alert box!"
        assertEquals("I am an alert box!",alerttext);

       // Accept pop-up
        driver.switchTo().alert().accept();

    }
}
