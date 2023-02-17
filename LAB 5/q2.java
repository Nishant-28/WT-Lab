// Write a program which will overload the area () method and 
// display the area of a circle, triangle and square as per user choice and user entered dimensions.

import java.util.Scanner;

class Area
{
    public void area(int a)
    {
        System.out.println("Area of square is: " + a*a);
    }
    public void area(int a, int b)
    {
        System.out.println("Area of rectangle is: " + a*b);
    }
    public void area(double a)
    {
        System.out.println("Area of circle is: " + 3.14*a*a);
    }
    public void area(double a, double b)
    {
        System.out.println("Area of triangle is: " + 0.5*a*b);
    }
}

public class q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("Select Shape for Area\n 1. Square \n 2. Rectangle\n 3. Circle\n 4. Triangle");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter side of square");
                int s = sc.nextInt();
                a.area(s);
                break;
            case 2:
                System.out.println("Enter length and breadth of rectangle");
                int l = sc.nextInt();
                int b = sc.nextInt();
                a.area(l, b);
                break;
            case 3:
                System.out.println("Enter radius of circle");
                double r = sc.nextDouble();
                a.area(r);
                break;
            case 4:
                System.out.println("Enter base and height of triangle");
                double b1 = sc.nextDouble();
                double h = sc.nextDouble();
                a.area(b1, h);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // NISHANT
}