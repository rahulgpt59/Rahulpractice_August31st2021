package TestNGPracticePackage;

import org.testng.annotations.*;

public class TestNgAnnotationsPractice {
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("I am before suite"+Thread.currentThread().getId());
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("I am before test");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("I am before Class"+Thread.currentThread().getId());
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("I am before method"+Thread.currentThread().getName());
    }
    @Test
    public void test()
    {
        System.out.println("I am actual test"+Thread.currentThread().getId());
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("I am after suite"+Thread.currentThread().getId());
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("I am after test"+Thread.currentThread().getId());
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("I am after Class"+Thread.currentThread().getId());
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("I am after method"+Thread.currentThread().getId());
    }
}
