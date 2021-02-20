package com.ramesh.basic;

public class FibonnaciEx1 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i=0; i < 10; i++)
        {
            System.out.print(firstNumber + ", ");
            int n = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = n;
        }

        System.out.println();
        for (int i = 0; i< 10; i++) {
            System.out.print(fibonnaciFun(i) + ", ");
        }
    }
    public static int fibonnaciFun(int i)
    {
        if(i <= 1)
            return i;
        //System.out.print(i + " ");
        return fibonnaciFun(i - 1) + fibonnaciFun(i -2);
    }
}
