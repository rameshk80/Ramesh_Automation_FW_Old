package com.ramesh.basic;

public class classEx1 {
    int height, width, length;
    classEx1()
    {
        this.height = 10;
        this.width = 20;
        this.length = 30;
    }

    classEx1(int h, int w, int l)
    {
        this.height = h;
        this.width = w;
        this.length = l;
    }

    public void setclassEx1(int h, int w, int l)
    {
        this.height = h;
        this.width = w;
        this.length = l;
    }

    public int volume()
    {
        return width * height * length;
    }

    public static void  main(String[] args)
    {
        classEx1 c = new classEx1(1, 2, 3);
        classEx1 c2 = c;
        classEx1 c3 = new classEx1();

        c2.setclassEx1(2,3,4);
        System.out.println(c.volume());
        System.out.println(c2.volume());
        System.out.println(c3.volume());
    }
}
