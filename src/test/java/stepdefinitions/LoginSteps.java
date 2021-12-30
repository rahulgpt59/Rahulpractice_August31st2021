package stepdefinitions;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

public class LoginSteps {
    WebDriver driver;
    @Given("Browser initialize")
    public void browser_initialize(){


        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        System.out.println("given done");

    }

    @When("Enter url")
    public void enter_url() throws Throwable {
        driver.get("https://www.amazon.com");


    }

    @Then("Search Iphone")
    public void verify_title() throws Throwable {
        Thread.sleep(10000);
        WebElement e=driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        e.sendKeys("Iphone");

    }

}
