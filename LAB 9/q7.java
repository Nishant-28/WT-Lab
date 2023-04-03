// Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement

import java.util.Scanner;

class q7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 26, 34, 44, 58, 62, 74, 82, 96, 100};
        System.out.print("Enter index of element to be displayed: ");
        int index = sc.nextInt();
        try
        {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        sc.close();
    }
}