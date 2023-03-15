// write a program to find a number is prime or not 

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 2;
        boolean isPrime = true;
        while (i * i <= n) {
            if (n % i == 0) // 9 % 2 = 171
            {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}