package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Day10_FileUploadTest extends TestBase {

    @Test
    public void fileUploadTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
//        1. locate choose file and click choose a file
//        <input type="file">
        WebElement chooseAFileButton = driver.findElement(By.id("file-upload"));
        Thread.sleep(2000);

//        2. select a file from your computer
        String userHOME = System.getProperty("user.home");
        String pathOfFile = userHOME + "/Desktop/logo.jpeg";

        //sending the path of the file that I want to upload
        //we can use sendkeys cause the input type file combination
        chooseAFileButton.sendKeys(pathOfFile);

//       String pathOfFile = userHOME + "\\Desktop\\logo.jpeg"; WINDOWS


//        3. then locate and click upload

        driver.findElement(By.id("file-submit")).click();

        //4 asserting

        boolean isEqual = driver.findElement(By.xpath("//h3")).getText().equals("File Uploaded!");
        Assert.assertTrue(isEqual);
    }
}
//  how do you upload a file with selenium?
//first selenium has limitation automation of files.But file upload can be done with selenium.
//we locate the choose file button and use sendkeys function to send the path of file.
//then we click upload button to upload the file.
//this will automaticlly upload the file

//LIMITATION
//selenium has limitation automation desktop apps
//For example, we can not find path of files, or verify if file exists on out machines with selenum
//Instead we use java File libraries
