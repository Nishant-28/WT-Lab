// Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement

import java.util.Scanner;

class q7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
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
    }
}