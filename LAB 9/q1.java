// Write a Java class which has a method called ProcessInput(). This method checks the number entered by the user. If the entered number is negative then throw an user defined exception called NegativeNumberException, otherwise it displays the double value of the entered number.

import java.util.Scanner;

class NegativeNumberException extends Exception
{
    public NegativeNumberException(String s)
    {
        super(s);
    }
}

class q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try
        {
            ProcessInput(n);
        }
        catch(NegativeNumberException e)
        {
            System.out.println(e);
        }
    }

    public static void ProcessInput(int n) throws NegativeNumberException
    {
        if(n < 0)
            throw new NegativeNumberException("Negative Number Entered");
        else
            System.out.println("Double of the number is: " + (2*n));
    }
}