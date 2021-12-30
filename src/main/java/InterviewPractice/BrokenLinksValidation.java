package InterviewPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinksValidation {
    public static void main(String[] args) throws IOException {
        validateBrokenLinks();

    }

    public static void validateBrokenLinks() throws IOException {
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
        driver.get("https://www.amazon.com");
        List<WebElement> linksList= driver.findElements(By.tagName("a"));
        linksList.addAll(driver.findElements(By.tagName("img")));
        List<WebElement> activeLinks=new ArrayList<WebElement>();
        for (int i=0;i<linksList.size();i++)
        {
            if(linksList.get(i).getAttribute("href")!=null)
            {
                activeLinks.add(linksList.get(i));
            }
        }
        //get the size of active link

        int totalActiveLinksAndImages=activeLinks.size();
        int totalLinksAndImages=linksList.size();
        System.out.println("total active links and images"+totalActiveLinksAndImages+"total links and images are"+totalLinksAndImages);
/*for(int j=0;j<activeLinks.size();j++)
{
    HttpURLConnection conn=HttpURLConnection(new URL(activeLinks.get(j).getAttribute("href")).openConnection());
}*/
    }
}
