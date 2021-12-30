package InterviewPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Practice_StaleElementException {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        //*******For headless browser*****
        /*ChromeOptions opt= new ChromeOptions();
        opt.addArguments("headless");
        driver=new ChromeDriver(opt);*/
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //*********For Amazon Website**********
        /*driver.get("https://www.amazon.com");
        WebElement e=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        //Manually refresh browser window to get stale element exception
        e.sendKeys("Iphone");*/

        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        WebElement e=driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
        String win=driver.getWindowHandle();
        System.out.println(win);
        e.click();

        Thread.sleep(5000);
        Alert a=driver.switchTo().alert();
        System.out.println(a.getText());


    }





}
