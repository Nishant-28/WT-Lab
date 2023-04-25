import java.io.*;
import java.util.*;

class NumberArray {
    int[] arr;
    int size;

    NumberArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    void storeRandomNumbers(int lb, int ub) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = lb + rand.nextInt(ub - lb + 1);
        }
    }

    void sortArray() {
        int[] primeNumbers = new int[size];
        int[] nonPrimeNumbers = new int[size];
        int primeIndex = 0, nonPrimeIndex = 0;

        for (int number : arr) {
            if (isPrime(number)) {
                primeNumbers[primeIndex++] = number;
            } else {
                nonPrimeNumbers[nonPrimeIndex++] = number;
            }
        }

        Arrays.sort(primeNumbers, 0, primeIndex);
        Arrays.sort(nonPrimeNumbers, 0, nonPrimeIndex);

        int index = 0;
        for (int i = 0; i < primeIndex; i++) {
            arr[index++] = primeNumbers[i];
        }
        for (int i = 0; i < nonPrimeIndex; i++) {
            arr[index++] = nonPrimeNumbers[i];
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the lower bound (lb): ");
        int lb = sc.nextInt();
        System.out.print("Enter the upper bound (ub): ");
        int ub = sc.nextInt();

        NumberArray numberArray = new NumberArray(n);
        numberArray.storeRandomNumbers(lb, ub);

        BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
        for (int i : numberArray.arr) {
            writer.write(Integer.toString(i) + " ");
        }
        writer.close();

        numberArray.sortArray();

        System.out.println("Updated array:");
        for (int i : numberArray.arr) {
            System.out.print(i + " ");
        }

        BufferedWriter writer2 = new BufferedWriter(new FileWriter("output.txt"));
        for (int i : numberArray.arr) {
            writer2.write(Integer.toString(i) + " ");
        }
        writer2.close();

        sc.close();
    }
}