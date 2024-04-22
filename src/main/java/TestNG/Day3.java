package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
@Parameters({"testUrl"})
    @Test
    public  void HomeLoan(String URL)
    {
        System.out.println("HomeLoan");
        System.out.println(URL);
    }
    @Test
    public  void HomeLoanDouble()
    {
        System.out.println("HomeLoanTriple");
    }
    @Test(groups = {"Smoke"})
    public  void HomeLoanTriple()
    {
        System.out.println("HomeLoanDouble");
    }

    @Test
    public void CarLoan()
    {
        System.out.println("CarLoan");
    }


    @Test(groups = {"Smoke"})
    public void PersonalLoan()
    {
//        Assert.assertTrue(false);
        System.out.println("PersonalLoan");
    }
}
