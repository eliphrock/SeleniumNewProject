package tests;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FilesExistTest extends TestBase {
    @Test
    public void isExistTest(){
        //        Pick a file on your desktop
//        1 cup of water
//        And verify if that file exist on your computer or not
        String userDIR= System.getProperty("user.dir");       //=>gives the path of the current folder
        System.out.println(userDIR);
        String userHOME=System.getProperty("user.home");      //=>gives you the user folder
        System.out.println(userHOME);


        // pick a file on your desktop

        //and verify if that file exist on your computer or not

        String pathOffFile=userHOME + "/Desktop/logo.jpeg"; //writing the path dynamically so this path can works on other laptops
        boolean isExist=Files.exists(Paths.get(pathOffFile));//returns True if file exists.False if file does not exists.
        Assert.assertTrue(isExist);
    }


}
