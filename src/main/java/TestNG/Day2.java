package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {
    @Test
    public void test()
    {
        System.out.println("Test");
    }
    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("Before Method Test");
    }
    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("After Method Test");
    }
}
