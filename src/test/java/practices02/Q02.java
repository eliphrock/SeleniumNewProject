package practices02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Q02 extends TestBase {

    @Test
    public void test2(){
            //Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
            driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

            //First switch into iframe
            WebElement emojisIframe = driver.findElement(By.id("emoojis"));
            driver.switchTo().frame(emojisIframe);

            //Click on the "Animals and Nature" emoji
            driver.findElement(By.xpath("(//span[@data-upgraded=',MaterialRipple'])[2]")).click();

        //Click on the "Animals and Nature" emoji
       List<WebElement> emojis=driver.findElements(By.xpath("//div[@id='nature']/div/img"));
//       for(WebElement w:emojis){
//           w.click();
//       }
       //using lambda
        emojis.forEach(WebElement::click);

        //Fill the form

        driver.switchTo().defaultContent();

       List<WebElement> inputs=driver.findElements(By.xpath("//input"));
       List<String> words=new ArrayList<>(Arrays.asList("This","iFrame","example","looks","really","funny","does","not","it","?","!"));
       for(int i=0; i< inputs.size();i++){
           inputs.get(i).sendKeys(words.get(i));

       }

        //Press the apply button
        driver.findElement(By.id("send")).click();


        // Verify "code" element is displayed
        WebElement code=driver.findElement(By.id("code"));
        assertTrue(code.isDisplayed());


    }
}
