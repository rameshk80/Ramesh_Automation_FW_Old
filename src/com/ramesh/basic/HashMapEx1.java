package com.ramesh.basic;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx1 {

    public static void  main(String[] args)
    {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Smit", 40);
        people.put("John", 25);
        people.put("John Kennedy", 35);


        System.out.println(people);

        for (String i:people.keySet())
        {
            System.out.println(i);
        }

        Iterator<String> str = people.keySet().iterator();

        while(str.hasNext())
        {
            System.out.println(people.get(str.next()));
        }

        System.out.println("The size is: " + people.size());

        Integer i = people.put("John", 32);
        System.out.println(i);
        System.out.println(people);

    }
}
