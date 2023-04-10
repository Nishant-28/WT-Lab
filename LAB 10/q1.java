// WAP to design a “MyString” class that perform string operations (compute string length, reverse a string) using your own methods.

import java.util.Scanner;

class MyString
{
    String str;
    MyString(String s)
    {
        str = s;
    }
    int length()
    {
        int i;
        for(i=0; str.charAt(i)!='\0'; i++);
        return i;
    }
    String reverse()
    {
        String rev = "";
        for(int i=length()-1; i>=0; i--)
            rev += str.charAt(i);
        return rev;
    }
}

public class q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        MyString ms = new MyString(s);
        System.out.println("Length of string: " + ms.length());
        System.out.println("Reverse of string: " + ms.reverse());
    }
}

