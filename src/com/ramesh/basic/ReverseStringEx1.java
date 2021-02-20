package com.ramesh.basic;

public class ReverseStringEx1 {
    public static void main(String[] args) {
        String mainString = new String("This is main string");
        System.out.println("Before reverse: " + mainString);
        System.out.println("After reverse: " + reverse(mainString));
    }
    public static String reverse(String mainStr)
    {
        if(mainStr == null)
        {
            System.out.println("String can't be null to reverse");
        }
        char[] reverseStr = new char[mainStr.length()];
        int j = 0;
        for (int i = mainStr.length() -1; i>0; i--)
        {
            reverseStr[j++] = mainStr.charAt(i);
        }
        return new String(reverseStr);
    }
    }
