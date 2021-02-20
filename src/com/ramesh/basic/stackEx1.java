package com.ramesh.basic;

public class stackEx1 {
    int[] list = new int[10];
    int index = -1;

    stackEx1()
    {

    }

    public void push(int i)
    {
        if(index >= 9)
        {
            System.out.println("Stack is full");
        }
        else
        {
            list[++index] = i;
        }
    }

    public int pop()
    {
        if(index < 0)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return list[--index];
        }
    }
    public void print()
    {
        for (int i = 0; i <= index; i++)
            System.out.println(list[i]);
    }

    public static void  main(String[] args)
    {
        stackEx1 s = new stackEx1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);
        s.push(11);
        s.push(11);
        s.print();

        s.pop();
        s.pop();
        s.print();

    }
}
