package JavaConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {

    @Test
    public void method() {
        System.out.println("Test Method");
        int a=3;
        PS2 obj=new PS2(a); //Parameterized Constructor
        System.out.println(obj.increment());
        System.out.println(obj.decrement());
        System.out.println(obj.multiplyTwo());
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }
    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("After Method");
    }
}
