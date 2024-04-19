package Streams;

import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Two {


    @Test
     public void test()
    {
        //Method 1 to create list (It is immutable list you can't remove and add elements)
        List<Integer> list1=List.of(1,2,3,4,5,5,6,6);

        //Method 2 to create list (It is immutable list you remove and add elements)
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(1);

        //Method 3 to create list (It is immutable list you can't remove and add elements)
        List<Integer> list3= Arrays.asList(1,2,4,6,3,1,23,5);



    }

}
