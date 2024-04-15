package Streams;

import jdk.dynalink.linker.LinkerServices;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class One {
        public static void test()
    {
        int count = 0;
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhay");
        names.add("RRSdhey");
        names.add("Mohan");
        names.add("Aman");
        names.add("Amina");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(names.get(i));
            if (name.startsWith("A", 0)) {
                count++;
            }
        }
        System.out.println(count);
    }

     public static void test1()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhay");
        names.add("RRSdhey");
        names.add("Mohan");
        names.add("Aman");
        names.add("Amina");
        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(2).forEach(s -> System.out.println(s));

        //There is no life for intermediate operation if there is no termianl operation  //Terminal=Last operation
        //Terminal Operation execute only if intermediate operation returns true or excute

        //How to use filter stream api

        long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);


        long d = Stream.of("Abhay", "Ram", "RRSdhey", "Mohan", "Ajay").filter(s ->
        {
            s.startsWith("A");
            return true;
        }).count();
        System.out.println(d);

    }
@Test
    public void StreamMap()
    {
//Print names which hava last letter as "a" with uppercase
      Stream.of("Abhay", "Raja", "RRSdhey", "Mohan", "Ajay").filter(s -> s.endsWith("a")).map(s ->s.toUpperCase()).forEach(s-> System.out.println(s));


        //Print names which have first letter as "a" with upper case and sorted
        List<String> name= Arrays.asList("Abhay", "Raja", "RRSdhey", "Mohan", "Ajay");
     //   name.stream().filter(s-> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s-> System.out.println(s));

        // Merging 2 different lists
        ArrayList<String> names = new ArrayList<String>();
        names.add("Rajkumar");
        names.add("Kamal");
        names.add("Radha");
        names.add("Ramu");
        names.add("Ramprasad");

       Stream<String> newname= Stream.concat(name.stream(),names.stream());
       //newname.sorted().forEach(s-> System.out.println(s));

       boolean flag=newname.anyMatch(s->s.equalsIgnoreCase("radha"));
       Assert.assertTrue(flag);
    }

    @Test
    public void streamCollect()
    {
        List<String> ls=Stream.of("Abhay", "Raja", "RRSdhey", "Mohan", "Ajay").filter(s -> s.endsWith("a")).map(s ->s.toUpperCase()).collect(Collectors.toList());
        ls.get(0);   //We can do this with limit as well

    }

    @Test
    public void collect()

    {
        List<Integer> number=   Arrays.asList(1,2,3,4,2,1,6,7,8);
      number.stream().distinct().forEach(s-> System.out.println(s));
     List<Integer> ls= number.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(ls.get(2));
    }

    //Assignment

    




    }



