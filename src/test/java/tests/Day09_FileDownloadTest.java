package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileDownloadTest extends TestBase {
    @Test
    public void downloadTest() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        //download junit-4.13-beta-3.jar file

        driver.findElement(By.linkText("junit-4.13-beta-3.jar")).click();
        Thread.sleep(2000);
        //then verify if the file download successfully
        String homeDirectory=System.getProperty("user.home");
        String filePath=homeDirectory+"/Downloads/junit-4.13-beta-3.jar";
        boolean isDownloaded= Files.exists(Paths.get(filePath));
        Assert.assertTrue(isDownloaded);


        //b10 all test cases, code.docx

        driver.findElement(By.linkText("b10 all test cases, code.docx")).click();
        Thread.sleep(2000);
        //then verify if the file download successfully
        String homeDirectory1=System.getProperty("user.home");
        String filePath1=homeDirectory+"/Downloads/b10 all test cases, code.docx";
        boolean isDownloaded1= Files.exists(Paths.get(filePath1));
        Assert.assertTrue(isDownloaded1);

    }
}
