package practices;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q06 extends TestBase {

    @Test
    public void hurriyet() throws InterruptedException {
       // 1-http://https://www.hurriyet.com.tr/  sayfasina gidin
        driver.get("https://www.hurriyet.com.tr/");
       // 2-sirasiyla gelen uyarilari kapatin
       // driver.findElement(By.xpath("//p[@class='fc-button-label']")).click();


        // driver.switchTo().alert().accept();

       // 3-en ust menudeki Spor Arena'ya gidin.
      //  4-Burda istediginiz takimin amblemine tiklayin.
       // 5-gelen sayfada orta kisimdaki haberlerden birinin acilmaisni sgalayin.
    }
}
