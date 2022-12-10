import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {

       // set uo chrome driver
        System.setProperty("webdriver.chrome.driver","./src/recources/drivers/chromedriver");

       // create chrome driver

        WebDriver driver=new ChromeDriver();

        // created webdriver ,we can automate web application

        driver.get("https://www.techproeducation.com");

        //  write your test cases
        driver.get("https://www.amazon.com");
    }

}
