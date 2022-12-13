package tests;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {
    @Test
    public void assertions() {
        /*
        What is assertion in testing ?
        Assertion is done to check if expected result is equal to actual result.
        -expected==actual->pass
        -expected !=actual->fail
        -------------------------------

       assertEquals("expected","actual");
       assertTrue(true);->pass
       assertTrue(false);->fail
       assertFalse(false);->pass
       assertFalse(true);->fail

       ------------------------------

         */

        Assert.assertEquals(5, 5);
        if("java".contains("apple")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        Assert.assertEquals("java", "java");
        Assert.assertEquals("java".contains("j"),true);

//        -----------------------------------------------------

        Assert.assertTrue("java".contains("j")); //pass

//        ------------------------------------------------------
        Assert.assertFalse("Java".contains("j")); //pass

//      test execution stops if one the assertion fails.this is called hard assertion


//        test execution continius even if test verification fails.verification means like if statement

        //what is difference between assertion and verification ?
        //assertion stops after assertion fails.Verification continues even after verification fails
        //Junit assertions are hard assertion.if statement is  verification
        // note: testNG has soft assertion as well. we will learn it in testNG
    }
}
