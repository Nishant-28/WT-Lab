// WAP to accept 10 numbers from command line and check how many of them are even and how many odd. 
import java.util.*;
public class q2 {
    public static void main(String[] args)
    {
        int[] n = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        for(int i=0; i<10; i++)
            n[i] = in.nextInt();
        
        System.out.println("Even digits are : " + check_even(n));
        System.out.println("Odd digits are  : " + check_odd(n));
        
    }

    static int check_even(int[] arr){
        int even_values = 0;
        for(int i=0; i<10; i++)
            if(arr[i] % 2 == 0)
                even_values++;
        return even_values;
    }
    static int check_odd(int[] arr){
        int odd_values = 0;
        for(int i=0; i<10; i++)
            if(arr[i] % 2 != 0)
                odd_values++;
        return odd_values;
    }
}