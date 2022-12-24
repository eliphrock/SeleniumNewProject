package homeworks;

import org.junit.Assert;
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

        driver.quit();
    }

@Test
    public void titleTest(){
       //titleTest =>Verify if google title = “Google” 
   driver.get("https://www.google.com/");
   Assert.assertEquals("Google",driver.getTitle());
   driver.quit();

}
@Test
    public void imageTest(){

    //    imageTest => Verify if google image displays or not 
    driver.get("https://www.google.com/");
    WebElement img=driver.findElement(By.id("hplogo"));
    Assert.assertTrue(img.isDisplayed()); ;
    driver.quit();

}
@Test
    public void gmailLinkTest(){
    //    gmailLinkTest => Verify if the Gmail link is displayed or not
    driver.get("https://www.google.com/");
    WebElement link=driver.findElement(By.xpath("//a[@class='gb_j']"));
    Assert.assertTrue(link.isDisplayed()); ;
    driver.quit();


}

}
