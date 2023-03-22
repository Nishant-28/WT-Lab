// Define an interface Motor with a data member – capacity and two methods such as run() and consume(). Define a Java class “Washing machine” which implements this interface and write the code to check the value of the interface data member thru an object of the class

import java.util.Scanner;

interface Motor
{
    int capacity = 100;
    void run();
    void consume();
}

class WashingMachine implements Motor
{
    int cap;
    public void run()
    {
        System.out.println("Washing Machine is running");

    }
    public void consume()
    {
        System.out.println("Washing Machine is consuming");

    }
}

public class q2
{
    public static void main(String[] args)
    {
        WashingMachine obj = new WashingMachine();
        obj.run();
        obj.consume();
        System.out.println("Capacity of Washing Machine is " + obj.capacity);
    }
}