package SeleniumOnly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ActionPractice {
    public static void main(String[] args) throws InterruptedException{
        actionMoveToElementPractice();

    }
    public static void actionMoveToElementPractice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        //d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        d.get("https://www.amazon.in");
        Actions action =new Actions(d);
        action.moveToElement(d.findElement(By.cssSelector("#nav-link-accountList")));
        action.moveToElement(d.findElement(By.linkText("Start here")));
action.click().build().perform();

    }

}

