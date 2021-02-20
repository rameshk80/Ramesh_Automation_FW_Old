package com.ramesh.basic;

public class StringEx1 {
    public static void main(String[] args) {
        System.out.println(removeSpace("T hi s is a sample  mes sa ge"));
    }
    public static String removeSpace(String s)
    {
        StringBuilder newString = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c:charArray)
        {
            //if(!Character.isWhitespace(c))
            if(c != ' ')
            {
                newString.append(c);
            }
        }

        return newString.toString();
    }
    }
