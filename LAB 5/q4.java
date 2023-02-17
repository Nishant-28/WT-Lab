// Write a program in java to define a class Shape which has data 
// member “area” and a member function showArea(). Derive two 
// classes Circle and Rectangle from Shape class. Add appropriate data 
// members and member functions to calculate and display the area of Circle and Rectangle.
// Q4 - 2D and 3D


import java.util.Scanner;
class Shape
{
    double area;
    void showArea()
    {
        System.out.println("Area is: "+area);
    }
}

class Circle extends Shape
{
    double radius;
    void getRadius()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }
    void calculateArea()
    {
        area = 3.14*radius*radius;
    }
}

class Rectangle extends Shape
{
    double length, breadth;
    void getLengthBreadth()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }
    void calculateArea()
    {
        area = length*breadth;
    }
}

public class q4
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.getRadius();
        c.calculateArea();
        c.showArea();
        r.getLengthBreadth();
        r.calculateArea();
        r.showArea();
    }
}