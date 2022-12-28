package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Q02 extends TestBase {
    @Test
    public void test(){


       // Go to "https://cgi-lib.berkeley.edu/ex/fup.html"
driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
      // Type "My File" into "Notes about the file" input
       driver.findElement(By.name("note")).sendKeys("My File");

       // Select the file to upload
        String userHome=System.getProperty("user.home");
        driver.findElement(By.name("upfile")).sendKeys(userHome+"/Desktop/Hello.txt");

     //   Click "Choose File" button
        driver.findElement(By.xpath("//input[@type='submit']")).click();

      //  Click on "Press" button



      //  Assert that "Your notes on the file were" equals "My File"
       String note= driver.findElement(By.xpath("//blockquote")).getText();
       assertEquals("My File",note);
      // Assert that file Content contains "Hello, I am uploaded file"
       String fileContent= driver.findElement(By.xpath("//pre")).getText();
        assertTrue(fileContent.contains("ÒHello, I am uploaded fileÓ"));
    }
}
