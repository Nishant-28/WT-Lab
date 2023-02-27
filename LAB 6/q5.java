// Write a program in java using inheritance to show how to call the base class parameterized constructors from the derived class using super.

import java.util.Scanner;
public class q5 {
    public static class base{
        int a;
        base(int a){
            this.a = a;
        }
    }
    public static class derived extends base{
        int b;
        derived(int a, int b){
            super(a);
            this.b = b;
        }
        void print(){
            System.out.println("a : " + a + " " + " b : " + b);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // cin >> a;
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        derived d = new derived(a, b);
        d.print();
    }
}