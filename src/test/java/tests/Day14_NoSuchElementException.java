package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day14_NoSuchElementException extends TestBase {
    @Test
    public void noSuchElementTest(){
        driver.get("https://techproeducation.com/");

        //wrong locator
        driver.findElement(By.id("wrong locator"));
    }
}
