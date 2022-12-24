package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonSearch extends TestBase {

    @Test
    public void test() throws InterruptedException {

        //TC01_As user I want to know how many item are there on amazon in the first page
        driver.get("https://www.amazon.com/");
       List<WebElement> h2=driver.findElements(By.xpath("//h2"));
        System.out.println(h2.size());
//after I search “porcelain teapot”?

        Thread.sleep(2000);
        WebElement teapot= driver.findElement(By.id("twotabsearchtextbox"));
        teapot.sendKeys("porcelain teapot", Keys.ENTER);

        driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
        driver.findElement(By.id("s-result-sort-select_1")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> price=driver.findElements(By.xpath("//span[@class='a-price']"));
        int size = price.size();
        System.out.println("Size of list = " + size);





        }



        //TC02_Order the the tea pot prices, find the min, max, and average price to the nearest cent.
    }
