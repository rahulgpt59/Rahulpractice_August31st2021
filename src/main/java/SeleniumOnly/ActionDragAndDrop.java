package SeleniumOnly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {
    public static void main(String[] args) throws NullPointerException {
        actionDragAndDrop();

    }

    public static void actionDragAndDrop ()throws NullPointerException {
        try
        {
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
            //driver.switchTo().frame(0);

            WebElement source = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]"));
            System.out.println(source.getText());
            WebElement target = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]"));
            System.out.println(target.getText());
            Actions action = new Actions(driver);
            action.clickAndHold(source).moveToElement(target).release().build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


