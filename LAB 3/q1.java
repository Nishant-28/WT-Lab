/* WAP to find the largest among 3 numbers user entered nos. at the command prompt using java. */

import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Largest number is: "+a);
        }
        else if(b>a && b>c){
            System.out.println("Largest number is: "+b);
        }
        else{
            System.out.println("Largest number is: "+c);
        }
    }
}