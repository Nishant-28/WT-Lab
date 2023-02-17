// Write a program in java using inheritance to show how to call 
// the base class parameterized constructors from the derived class using super. 
// Consider the base class is “Shape2D” for rectangle and define subclass “Shape3D” for cube.

import java.util.Scanner;

class Shape2D
{
    int l, b;
    Shape2D(int l, int b)
    {
        this.l = l;
        this.b = b;
    }
    public void area()
    {
        System.out.println("Area of rectangle is: " + l*b);
    }
}

class Shape3D extends Shape2D
{
    int h;
    Shape3D(int l, int b, int h)
    {
        super(l, b);
        this.h = h;
    }
    public void volume()
    {
        System.out.println("Volume of cube is: " + l*b*h);
    }
}

public class q5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth and height of cube");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        Shape3D s = new Shape3D(l, b, h);

        s.volume();
    }
}