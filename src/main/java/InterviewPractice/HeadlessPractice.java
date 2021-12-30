package InterviewPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.DriverManager;

public class HeadlessPractice {

    @Test

    public void checkHeadless()
    {
        WebDriver driver=null;

        WebDriverManager.chromedriver().setup();

        ChromeOptions s =new ChromeOptions();
        s.addArguments("Headless");

        driver=new ChromeDriver(s);
        SoftAssert sa= new SoftAssert();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
        String handle= driver.getWindowHandle();
        System.out.println("window handle is " + handle);
        int totalWindows=driver.getWindowHandles().size();
        sa.assertEquals(totalWindows,5);
        System.out.println("soft assert pass even we assert with 5 windows");
        assert totalWindows==1 ;//keeping hard asset only with 1 window

        System.out.println("Both the above assertion pass and hence only 1 window is open");
        System.out.println("We are inside amazon website ");





    }

}
