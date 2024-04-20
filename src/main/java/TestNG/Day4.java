package TestNG;

import org.testng.annotations.*;

public class Day4 {

    @Test(groups = {"Smoke"})
    public void testDay4 ()
    {
        System.out.println("Day 4 Test");
    }
    @BeforeTest
    public void BeforeClass()
    {
        System.out.println("Before Class Execution");
    }
    @AfterTest
    public void AfterClass()
    {
        System.out.println("After Class Execution");
    }

@BeforeSuite
    public void BeforeSuite()
{
    System.out.println("Before Suite");
}
@AfterSuite
    public void AfterSuite()
{
    System.out.println("After Suite");
}

}
