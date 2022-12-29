package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class Day11_ScreenshotOfSpecificElements extends TestBase {

    @Test
    public void test() throws IOException {
        driver.get("https://www.techproeducation.com");
        WebElement techproLogo=driver.findElement(By.xpath("//div[@data-id='898ce2e']"));
       //verifying the logo
        Assert.assertTrue(techproLogo.isDisplayed());
       //getting the ss using reusable method
        takeScreenShotOfTheElement(techproLogo);

        //taking ss of social media icons
        WebElement socials = driver.findElement(By.xpath("//div[@data-id='d7545f2']"));
        takeScreenShotOfTheElement(socials);

    }
}
