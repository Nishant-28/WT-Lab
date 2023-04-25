// WAP to design a MyString class that perform string operations (compute string length, reverse a string, change cases, compare two string) using your own methods.

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
    
    // change cases code
    String changeCase()
    {
        String s = "";
        for(int i=0; str.charAt(i)!='\0'; i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                s += (char)(str.charAt(i) - 32);
            else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                s += (char)(str.charAt(i) + 32);
            else
                s += str.charAt(i);
        }
        return s;
    }

    // compare two string
    void compare(MyString s)
    {
        int i;
        for(i=0; str.charAt(i)!='\0' && s.str.charAt(i)!='\0'; i++)
        {
            if(str.charAt(i) != s.str.charAt(i))
                break;
        }
        if(str.charAt(i) == s.str.charAt(i))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
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

