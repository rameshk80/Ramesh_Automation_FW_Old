package com.ramesh.basic;

import java.io.*;
import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
	    ArrayList<Integer> simpleArray = new ArrayList<Integer>();
	    simpleArray.add(2);
	    simpleArray.add(4);
	    simpleArray.add(23);
	    simpleArray.add(1231);
	    simpleArray.add(8);

        System.out.println("Print the values by index");
        System.out.println(simpleArray.get(0) + " " + simpleArray.get(1));
        System.out.println(simpleArray.get(2));System.out.println(simpleArray.get(3));
        System.out.println(simpleArray.get(4));

        System.out.println("print the values by index in a simple loop");
        for (byte b = 0; b < 5; b++)
        {
            System.out.print(simpleArray.get(b) + " ");
        }

        System.out.println("Printing the value by index in for each loop");
        for (Integer in:simpleArray) {
            System.out.print(in + " ");
        }

        System.out.println("Printing ArrayList directly without loop");
        System.out.println(simpleArray);

        //remove duplicate example
        simpleArray.add(3);simpleArray.add(3);
        simpleArray.add(1);simpleArray.add(4);

        System.out.println("Array size before removing duplicate: " + simpleArray.size());
        Set<Integer> s = new LinkedHashSet<Integer>(simpleArray);
        simpleArray.clear();
        simpleArray.addAll(s);
        System.out.println("Array size after removing duplicate: " + simpleArray.size());
        System.out.println(simpleArray);
    }
}
