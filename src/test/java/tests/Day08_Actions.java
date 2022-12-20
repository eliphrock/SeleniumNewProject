package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions extends TestBase {
    /*

    Create a class: Actions1
Create a test method : contextClickMethod() and test the following scenario:
Given user is on the https://the-internet.herokuapp.com/context_menu
When use Right clicks on the box
Then verify the alert message is “You selected a context menu”
Then accept the alert
     */
    @Test
    public void actions1(){

        driver.get("https://the-internet.herokuapp.com/context_menu");
     // When use Right clicks on the box
     //    1.creating action object to do rught click
        Actions actions= new Actions(driver);
     // 2. locating the element and appropriate function to right click
        WebElement box= driver.findElement(By.id("hot-spot"));
    //  3. use actions object and apppropriate function to right click
        actions.contextClick(box).perform();
    // then verify the alert message is "you selected a context menu"
        String text=driver.switchTo().alert().getText();
        Assert.assertEquals("You selected a context menu",text);
     // then accept the alert
     driver.switchTo().alert().accept();
    }
}
