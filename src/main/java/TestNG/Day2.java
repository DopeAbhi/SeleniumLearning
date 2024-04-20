package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {
    @Test(dataProvider ="getData")
  //  (dataProvider="getDataa", dataProviderClass =CustomDataProvider.class ) //When Data Provider is in another class
    public void test(String ID, String Password)
    {

        System.out.println(ID);
        System.out.println(Password);
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


    @DataProvider
    public Object[] getData()
    {
        Object[] []data = new Object[3][2];

        //1st Set of Data
         data[0][0] ="1st User ID";
         data[0][1] ="1st User Password";

      //2nd set of Data
         data[1][0] ="2nd User ID";
         data[1][1] ="2nd User Password";

         //3rd set of Data
         data[2][0] ="3rd User ID";
         data[2][1] ="3rd User Password";


        return data;
    }
}
