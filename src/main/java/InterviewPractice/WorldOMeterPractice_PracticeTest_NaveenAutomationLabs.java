package InterviewPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldOMeterPractice_PracticeTest_NaveenAutomationLabs {
    public static void main(String[] args) {


        WebDriver driver= null;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.worldometers.info/world-population/");
        while(true)
        {
            String worldPopulation=driver.findElement(By.cssSelector(".maincounter-number")).getText();
            String todayBirth=driver.findElement(By.cssSelector(".sec-counter")).getText();



            System.out.println(worldPopulation);
        }
    }
}
