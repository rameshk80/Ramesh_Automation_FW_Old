package com.ramesh.basic;

import java.util.*;

public class HashsetEx1 {

    public static void  main(String[] args)
    {
        HashSet<Integer> map = new HashSet<Integer>();

        map.add(12);
        map.add(23);
        map.add(231);
        map.add(23);
        map.add(232);
        map.add(23);
        //map.remove(23);
        System.out.println(map);

        for (Integer i:map
             ) {
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator<Integer> i = map.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next() + " ");
        }



    }
}
