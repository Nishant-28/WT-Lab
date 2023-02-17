// WAP to define a class Rectangle having data members length and breadth, to calculate the area and perimeter.
// Use constructor and member function to read, calulate and display.

import java.util.Scanner;
class Rectangle{
    int length , breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    void calculate(){
        System.out.println("Area : "+(length*breadth));
        System.out.println("Perimeter : "+(2*(length+breadth)));
    }
}
class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth :");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r1 = new Rectangle(l,b);
        r1.calculate();
    }
}
