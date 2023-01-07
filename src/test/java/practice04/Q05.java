package practice04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Q05 extends TestBase {
    @Test
    public void test() {
        //  Go to https://testpages.herokuapp.com/styled/basic-html-form-test.html
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

        //    Fill the username, password and textArea comment:
        driver.findElement(By.name("username")).sendKeys("JohnDoe");
        driver.findElement(By.name("password")).sendKeys("123456");
        WebElement textArea = driver.findElement(By.name("comments"));
        textArea.sendKeys(Keys.CLEAR + "123456");

        //    Choose a file and upload it
        String homeDirectory = System.getProperty("user.home");
        String filePath = homeDirectory + "/Downloads";
        driver.findElement(By.name("filename")).sendKeys(filePath);

        //    Select all checkboxes, radio item and dropdowns
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@name='checkboxes[]'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@name='checkboxes[]'])[2]"));
        WebElement checkBox3 = driver.findElement(By.xpath("(//input[@name='checkboxes[]'])[3]"));
        if (!checkBox1.isSelected()) {
            checkBox1.click();
        }
        if (!checkBox2.isSelected()) {
            checkBox2.click();
        }
        if (!checkBox2.isSelected()) {
            checkBox2.click();
        }

        driver.findElement(By.xpath("//input[@value='rd1']")).click();//Radio Button 1

        WebElement dropdown = driver.findElement(By.xpath("//select[@multiple='multiple']"));
        Select select = new Select(dropdown);
        select.deselectAll();
        driver.findElement(By.xpath("//option[@value='ms1']")).click();//Radio Button 1
        //select.selectByIndex(0);
        //dropdown.sendKeys(Keys.SHIFT);
        //select.selectByIndex(2);//Option 1

        //Click on submit
        driver.findElement(By.xpath("//input[@value='submit']")).click();

        // Verify that uploaded file name is on the Form Details.
        String message = driver.findElement(By.xpath("//div[@class='explanation']//p")).getText();
        Assert.assertTrue(message.contains("You submitted a form."));
    }

    @Test
    public void test1() {
        //Go to https://testpages.herokuapp.com/styled/basic-html-form-test.html
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

        //Fill the username, password and textArea comment:
        driver.findElement(By.name("username")).sendKeys("JohnDoe");
        driver.findElement(By.name("password")).sendKeys("1234");
        WebElement comments = driver.findElement(By.name("comments"));
        comments.clear();
        comments.sendKeys("Hello I am a comment");

        //Choose a file and upload it
        String userHome = System.getProperty("user.home");
        driver.findElement(By.name("filename")).sendKeys(userHome + "/Downloads/image.png");

        //Select all checkboxes, radio item 1 and dropdown 1
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='cb1']"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@value='cb2']"));
        WebElement checkBox3 = driver.findElement(By.xpath("//input[@value='cb3']"));

        if (!checkBox1.isSelected()) {
            checkBox1.click();
        }
        if (!checkBox2.isSelected()) {
            checkBox2.click();
        }
        if (!checkBox3.isSelected()) {
            checkBox3.click();
        }

        driver.findElement(By.xpath("//input[@value='rd1']")).click();//Radio Button 1

        WebElement dropDown = driver.findElement(By.name("multipleselect[]"));
        Select select = new Select(dropDown);
        select.deselectAll();
        driver.findElement(By.xpath("//option[@value='ms1']")).click();//Option 1

        //Click on submit
        driver.findElement(By.xpath("//input[@value='submit']")).click();

        //Verify that uploaded file name is on the Form Details.
        String fileName = driver.findElement(By.id("_valuefilename")).getText();
        assertEquals("image.png", fileName);
    }
}
