package Streams;

import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Two {


    @Test
     public void test()
    {
       List<String> li=new ArrayList<String>();
       li.add("My Java is Java");
        li.stream().collect(Collectors.groupingBy(s-> s,Collectors.counting()));

    }

}
