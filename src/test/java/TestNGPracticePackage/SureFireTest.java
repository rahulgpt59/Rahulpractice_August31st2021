package TestNGPracticePackage;

import org.testng.annotations.Test;

public class SureFireTest {
    @Test
    public void surefireTest()
    {
        System.out.println("I am surefire test"+Thread.currentThread().getName());
    }
    @Test
    public void surefireTest1()
    {
        System.out.println("I am surefire test1"+Thread.currentThread().getName());
    }
    @Test
    public void rahul()
    {
        System.out.println("I am Rahul test"+Thread.currentThread().getName());
    }
}
