package practice04;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Q02 extends TestBase {
    @Test
    public void test(){
//        Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
  driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");
//        Click on "click me" button
        waitFor(5);
        driver.findElement(By.id("growbutton")).click();

//        Verify that "Event Triggered"
      String text=  driver.findElement(By.id("growbuttonstatus")).getText();
      assertEquals("Event Triggered",text);
    }
}
