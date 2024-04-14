package Streams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class One {
@Test
//    public static void test()
//    {
//        int count=0;
//        ArrayList<String> names= new ArrayList<String>();
//        names.add("Abhay");
//        names.add("RRSdhey");
//        names.add("Mohan");
//        names.add("Aman");
//        names.add("Amina");
//
//        for (int i=0; i<names.size(); i++)
//        {
//            String name=names.get(i);
//            System.out.println(names.get(i));
//            if(name.startsWith("A",0))
//            {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }

    public static void test1()
    {
        ArrayList<String> names= new ArrayList<String>();
        names.add("Abhay");
        names.add("RRSdhey");
        names.add("Mohan");
        names.add("Aman");
        names.add("Amina");

        //There is no life for intermediate operation if there is no termianl operation  //Terminal=Last operation
        //Terminal Operation execute only if intermediate operation returns true

        //How to use filter stream api

      long c=  names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);


        long d = Stream.of("Abhay","Ram","RRSdhey","Mohan","Ajay").filter(s->
        {
            s.startsWith("A");
            return true;
        }).count();
        System.out.println(d);

    }


}

