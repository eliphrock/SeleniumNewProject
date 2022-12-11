package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_UrlVerification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./src/recources/drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.techproeducation.com/");

        //verify if techproeducation homepage url is "https://www.techproeducation.com"

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://techproeducation.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ActualUrl is :"+actualUrl);
            System.out.println("But Expected Url :"+expectedUrl);
        }
        driver.quit();

        /*
        What is your approach for automation
        -I read the acceptance criterias carefully.
        -I then create my test cases
        -Then I do my manual testing FIRST
            -If all good,then I start complete my automation script
            -If I find a bug/defect,then I talk to dev. Dev fizes the issues,then I retest.If all is good then complete my automation script.
        -When the automation is complete,I prepare the report for the user story.In fact,my automation script
        generates html reports for us.I upload those reports to the JIRA
        -For my manual test cases,I manually take screenshots and prepare reports and attach them to the JIRA.
     --------------------------------------------------------------------
        What do you do when your test case pass ?

        -Prepare report and upload to Jira
     --------------------------------------------------------------------
        What do you do when your test case fail ?
        -Retest to make sure the failure.It can be data issue,typo,documentation or is can be a real bug.
        -if that is a bug,then talk to the dev and let them fix the bug.
        -After the fix,we retest.When test cases passes we upload to JIRA.

     --------------------------------------------------------------------
        What do you do when you find a bug ?
        -Retest to make sure the failure.It can be data issue,typo,documentation or is can be a real bug.
        -if that is a bug,then talk to the dev and let them fix the bug.
        -After the fix,we retest.When test cases passes we upload to JIRA.
    ----------------------------------------------------------------------


         */
    }
}
