// Write a program to create user defined exceptions called HrsException, MinException and SecException. Create a class Time which contains data members hours, minutes, seconds and throw the user defined exceptions if hours (>24 & <0), minutes(>60 & <0), seconds(>60 & <0).

import java.util.Scanner;

class HrsException extends Exception
{
    public HrsException(String s)
    {
        super(s);
    }
}

class MinException extends Exception
{
    public MinException(String s)
    {
        super(s);
    }
}

class SecException extends Exception
{
    public SecException(String s)
    {
        super(s);
    }
}

class Time
{
    private int hrs, min, sec;
    public Time(int hrs, int min, int sec) throws HrsException, MinException, SecException
    {
        if(hrs > 24 || hrs < 0)
            throw new HrsException("Hours should be between 0 and 24");
        else
            this.hrs = hrs;
        if(min > 60 || min < 0)
            throw new MinException("Minutes should be between 0 and 60");
        else
            this.min = min;
        if(sec > 60 || sec < 0)
            throw new SecException("Seconds should be between 0 and 60");
        else
            this.sec = sec;
    }
    public void display()
    {
        System.out.println("Time: " + hrs + ":" + min + ":" + sec);
    }
}

class q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();
        System.out.print("Enter seconds: ");
        int s = sc.nextInt();
        try
        {
            Time t = new Time(h, m, s);
            t.display();
        }
        catch(HrsException e)
        {
            System.out.println(e);
        }
        catch(MinException e)
        {
            System.out.println(e);
        }
        catch(SecException e)
        {
            System.out.println(e);
        }
    }
}