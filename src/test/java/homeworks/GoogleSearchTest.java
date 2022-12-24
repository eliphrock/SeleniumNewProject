package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class GoogleSearchTest extends TestBase {

    @Test
    public void test(){
       // When user goes to https://www.google.com/
        driver.get("https://www.google.com/");
      //  Search for “porcelain teapot”
        WebElement teaPot=driver.findElement(By.xpath("//input[@name='q']"));
        teaPot.sendKeys("porcelain teapot", Keys.ENTER);

       // And print how many related results displayed on Google
       WebElement result=driver.findElement(By.id("result-stats"));
        System.out.println(result.getText());
    }

}
