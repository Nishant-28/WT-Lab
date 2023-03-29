// Create an user defined exception named Check Argument to check the number of arguments passed through command line. If the number of arguments is less than four, throw the Check Argument exception, else print the addition of squares of all the four elements

import java.util.Scanner;

class CheckArgument extends Exception
{
    public CheckArgument(String s)
    {
        super(s);
    }
}

class q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            if(args.length < 4)
                throw new CheckArgument("Number of arguments should be 4");
            else
            {
                int sum = 0;
                for(int i = 0; i < 4; i++)
                    sum += Integer.parseInt(args[i]) * Integer.parseInt(args[i]);
                System.out.println("Sum of squares of all the four elements is: " + sum);
            }
        }
        catch(CheckArgument e)
        {
            System.out.println(e);
        }
    }
}