package TestNGPracticePackage;

import org.testng.annotations.Test;

public class TestNgPractice {
    @Test(groups = {"Smoke"})
    public void test1()
    {
        System.out.println("I am Test1"+Thread.currentThread().getId());
    }
    @Test(groups = {"Smoke"})
    public void test2()
    {
        System.out.println("I am Test2"+Thread.currentThread().getId());
    }
    @Test(groups = {"Regression"})
    public void test3()
    {
        System.out.println("I am Test3"+Thread.currentThread().getId());
    }
    @Test(groups = {"Regression"})
    public void test4()
    {
        System.out.println("I am Test4"+Thread.currentThread().getId());
    }
    @Test(groups = {"Regression","Smoke"})
    public void test5()
    {
        System.out.println("I am Test5"+Thread.currentThread().getId());
    }
}
