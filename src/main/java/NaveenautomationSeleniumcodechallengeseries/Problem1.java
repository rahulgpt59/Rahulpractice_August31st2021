package NaveenautomationSeleniumcodechallengeseries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Problem1 {
    @Test
    public void zoopla_Test()

    {
        WebDriver driver=null;
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.zoopla.co.uk");
        WebElement textBox1=driver.findElement(By.xpath("//input[@id='header-location']"));
        textBox1.click();
        textBox1.sendKeys("London");
        textBox1.click();
        WebElement submitButton=driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
        submitButton.click();


    }
}
