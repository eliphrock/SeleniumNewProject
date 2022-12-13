package tests;

import org.junit.*;

public class Day02_JUnitAnnotations {
    /*
     *so far we kept using main method
     * we no longer need to use main method to create test cases with JUnit
     * -@Test : is used to create test cases
     * NOTE: all @Test methods must be void!!!
     * @BeforeMethod: runs before each @Test class.This is used to run repeated pre condition
     * for example, setup,create driver,maximize window
     * @AfterMethod : runs after each @Test class.This is used to run repeated after condition
     * for example,driver quit report generation
     * @BeforeClass:runs before each class only once. this method must be static
     * @AfterClass: runs after each class only oncethis method must be static
     * @Ignore: is used to skip/ignore a test case
     */
    @BeforeClass
    public static void setUpClass(){
        System.out.println("Before Class Runs before the entire class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class Runs after the entire class");
    }
    @Before
    public void setUpMethod(){
        System.out.println("Before Method Runs before each @Test annottation");
    }
    @After
    public void tearDown(){
        System.out.println("After Method Runs after each @Test annottation");
    }
    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Test @Ignore
    public void test3() {
        System.out.println("Test 3");
    }

    @Test
    public void test4() {
        System.out.println("Test 4");
    }

    @Test
    public void test5() {
        System.out.println("Test 5");
    }
}