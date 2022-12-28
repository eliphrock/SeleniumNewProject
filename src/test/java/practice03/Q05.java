package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Q05 extends TestBase {
    @Test
    public void test() throws InterruptedException {

       // Go to http://webdriveruniversity.com/To-Do-List/index.html
       driver.get("http://webdriveruniversity.com/To-Do-List/index.html");
      //  Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
      List<String> todosList=new ArrayList<>(Arrays.asList("Prepare breakfast", "Wash the dishes", "Take care of baby", "Help your kid's homework"," Study Selenium", "Sleep"));
      WebElement addToDo=driver.findElement(By.xpath("//input[@type='text']"));
        Actions action=new Actions(driver);
        for(String w:todosList){
            action.click(addToDo).sendKeys(w).sendKeys(Keys.ENTER).perform();
        }
      //  Strikethrough all todos.
        Thread.sleep(2000);
        List<WebElement> list=driver.findElements(By.xpath("//li"));
        for(WebElement w:list){
            w.click();
        }
       // Delete all todos.
        Thread.sleep(2000);
        List<WebElement> deleteList=driver.findElements(By.xpath("//i[@class='fa fa-trash']"));
        for(WebElement w:deleteList){
            w.click();
        }

       // Assert that all todos deleted.
        Thread.sleep(2000);
        List<WebElement> listAfterDelete=driver.findElements(By.xpath("//li"));
        assertEquals(0,listAfterDelete.size());


    }
}
