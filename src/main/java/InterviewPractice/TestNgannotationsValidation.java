package InterviewPractice;

import org.testng.annotations.*;

public class TestNgannotationsValidation
{
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }

    public void beforeClass()
    {
        System.out.println("Before class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before method");
    }
    @Test
    public void mainTest()
    {
        System.out.println("Main test");
    }

    //after annotations
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("after Suite");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }
    @AfterClass
    public void AfterClass()
    {
        System.out.println("After class");
    }
    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("after method");
    }
}
