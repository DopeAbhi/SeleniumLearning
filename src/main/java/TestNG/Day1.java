package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day1 {
    @Parameters({"testUrl"})
    @Test (dependsOnMethods = "test2" )
    public void test(String URL)
    {
        System.out.println("Test Day1 ");
        System.out.println(URL);
    }
    @Test (timeOut = 4000)
    public void test2()
    {
        System.out.println("Test Day1.1 ");
    }
    @Test(enabled = false)
    public void test3()
    {
        System.out.println("Test Day1.2 ");
    }


}
