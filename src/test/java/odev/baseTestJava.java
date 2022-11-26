package odev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class baseTestJava {

    @Test
     public void setup() {
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("https://www.network.com.tr/");

         String expectedUrl = "https://www.network.com.tr/";
         String actualUrl = driver.getCurrentUrl();
         Assert.assertEquals(expectedUrl,actualUrl);

         WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='search']"));
         aramaKutusu.sendKeys("Ceket");
         aramaKutusu.click();

    }
}
