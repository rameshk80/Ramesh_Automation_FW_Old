package com.ramesh.basic;

public class polyndromeEx1 {
    public static void  main(String[] args)
    {
        int num = 34543;
        if (palindrome(num))
        {
            System.out.println("its poly");
        }
        else
        {
            System.out.println("its not poly");
        }
    }

    public static boolean palindrome(int n)
    {
        int reverse = 0, pal = n;
        while(n != 0)
        {
            int remind = n % 10;
            reverse = reverse * 10 + remind;
            n /= 10;
        }
        if(reverse == pal) {
            return true;
        }
        else {
            return false;
        }
    }
}
