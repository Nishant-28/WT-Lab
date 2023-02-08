// Write a program to calculate area according to user input, whether it is circle, square or triangle (Menu Driven).
import java.util.Scanner;
public class q4{
    public static void main(String[] args)
    {
        System.out.println("1. Circle\t 2. Square\t 3. Triangle \n Enter your choice :");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter radius : ");
                Double radius = in.nextDouble();
                System.out.println("Area of circle is : " + area_circle(radius));
                break;
            case 2:
                System.out.println("Enter side : ");
                Double side = in.nextDouble();
                System.out.println("Area of square is : " + area_square(side));
                break;
            case 3:
                System.out.println("Enter base : ");
                Double base = in.nextDouble();
                System.out.println("Enter height : ");
                Double height = in.nextDouble();
                System.out.println("Area of triangle is : " + area_triangle(base, height));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    static double area_circle(Double r){
        return 3.14 * r * r;
    }
    static double area_square(Double s){
        return s*s;
    }
    static double area_triangle(Double b, Double h){
        return 0.5 * b * h;
    }
}