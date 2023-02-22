// Implement q3.java using Dynamic Method Dispatch

import java.util.Scanner;

class Shape
{
    int l, b;
    Shape(int l, int b){
        this.l = l;
        this.b = b;
    }
    int area(){
        return l*b;
    }
}

class Rectangle extends Shape
{
    Rectangle(int l, int b){
        super(l, b);
    }
}

class Triangle extends Shape
{
    Triangle(int l, int b){
        super(l, b);
    }
    int area(){
        return (l*b)/2;
    }
}

public class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b, base, height;
        System.out.println("Enter length and breadth of Rectangle ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter base and height of Triangle ");
        base = sc.nextInt();
        height = sc.nextInt();
        Shape[] s = new Shape[2];
        s[0] = new Rectangle(l, b);
        s[1] = new Triangle(base, height);
        for(int i=0; i<2; i++){
            System.out.println("Area: " + s[i].area());
        }
    }
}