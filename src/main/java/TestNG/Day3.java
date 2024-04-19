package TestNG;

import org.testng.annotations.Test;

public class Day3 {

    @Test
    public  void HomeLoan()
    {
        System.out.println("HomeLoan");
    }
    @Test
    public  void HomeLoanDouble()
    {
        System.out.println("HomeLoanTriple");
    }
    @Test
    public  void HomeLoanTriple()
    {
        System.out.println("HomeLoanDouble");
    }
    @Test
    public void CarLoan()
    {
        System.out.println("CarLoan");
    }

    @Test
    public void PersonalLoan()
    {
        System.out.println("PersonalLoan");
    }
}
