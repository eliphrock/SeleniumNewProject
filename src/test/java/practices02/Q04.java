package practices02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class Q04 extends TestBase {

    @Test
    public void test4(){

       // Go to https://www.gmibank.com/
        driver.get("https://www.gmibank.com/");

       // Hover over "Premium" Deposit Package
       WebElement premiumElement= driver.findElement(By.xpath("//h4[.='Premium']"));
       Actions actions=new Actions(driver);
       actions.moveToElement(premiumElement).perform();
     //   Click on "Book Now"

        driver.findElement(By.linkText("Book Now")).click();

      //  Verify url contains "services"
        String url=driver.getCurrentUrl();
        assertTrue(url.contains("services"));

    }
}
