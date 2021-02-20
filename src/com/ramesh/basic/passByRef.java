package com.ramesh.basic;

public class passByRef {
    int i, j;
    passByRef()
    {
        i = 10;
        j = 20;
    }
    public void ref(passByRef p)
    {
        p.i = 20; p.j = 40;
    }
    public void print()
    {
        System.out.println(i + " " + j);
    }
    public static void  main(String[] args)
    {
        passByRef p = new passByRef();
        passByRef p1 = new passByRef();
        p.print();
        p.ref(p1);
        p.print();
        p1.print();

    }
}
