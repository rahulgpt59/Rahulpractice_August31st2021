package InterviewPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RadioButtonPractice {
     SoftAssert asser= new SoftAssert();
    @Test
    public  void checkingRadioButton() throws NullPointerException {
        try {
            WebDriver d = null;
            WebDriverManager.chromedriver().setup();
            ChromeOptions ch= new ChromeOptions();
            ch.addArguments("headless");
            d=new ChromeDriver(ch);
            d.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
            d.findElement(By.name("optradio")).click();
            d.findElement(By.cssSelector("#buttoncheck")).click();
            WebElement e= d.findElement(By.cssSelector(".radiobutton"));
            String s=e.getText();
            String expected="Radio button 'Ma' is checked";
            asser.assertEquals(s,expected,"Radio button text box text is not correct");
            System.out.println("Executed even after above assertion failed");
            asser.assertAll();



        } catch (NullPointerException e) {
            System.out.println("Got null pointer exception");
        }

    }
}
