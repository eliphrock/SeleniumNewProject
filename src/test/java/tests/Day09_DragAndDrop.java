package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day09_DragAndDrop extends TestBase {

    @Test
    public void dragAndDropTest(){
        driver.get("https:/jqueryui.com/droppable/");

//    and user moves the target element(drag me to my target) on to destination


        //below elements are in the iframe so switch to iframe first
        driver.switchTo().frame(0);//switch to first iframe
    WebElement source=driver.findElement(By.id("draggable"));
    WebElement target=driver.findElement(By.id("droppable"));

//  user actions class to move source into target
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).perform();
    }

    /*
    when test fail
    1-check locater
    2-wait issue or synchronization
    3-iframe--this was the issue
     */

    @Test
    public void clickAndHoldTest(){
        driver.get("https:/jqueryui.com/droppable/");

//    and user moves the target element(drag me to my target) on to destination


        //below elements are in the iframe so switch to iframe first
        driver.switchTo().frame(0);//switch to first iframe
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));

        //  user actions class to move source into target
        Actions actions=new Actions(driver);
       actions.clickAndHold(source).moveToElement(target).build().perform();
    }

}
