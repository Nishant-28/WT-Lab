// Write a Java program to illustrate try, catch, and finally block
import java.util.Scanner;

class q8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try{
            if(n < 0)
                throw new NegativeNumberException("Number is negative");
            else
                System.out.println("Number is positive");
        }
        catch(NegativeNumberException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}

class NegativeNumberException extends Exception{
    public NegativeNumberException(String s){
        super(s);
    }
}