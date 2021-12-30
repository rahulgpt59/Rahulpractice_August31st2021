package SeleniumOnly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class AlertPractice {
    public static void main(String[] args) throws InterruptedException {
        alertPractice();

    }
    public static void alertPractice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        //Practicing Alert start
        //By alertButton=By.name("alert");
        By confirmationButton=By.name("confirmation");
        //driver.findElement(alertButton).click();
        driver.findElement(confirmationButton).click();
        Alert alert=driver.switchTo().alert();
        System.out.println("Got text"+alert.getText());
        Thread.sleep(5000);
        alert.dismiss();

    }
}
