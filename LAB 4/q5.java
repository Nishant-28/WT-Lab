// Write a program in Java to define a class Number with appropriate data members and member functions to input n number of integers and swap the biggest and smallest elements. Use member functions read(), swap() and display()
import java.util.Scanner;
class Number {
    int[] arr;
    int n;
    Number(int n){
        this.n = n;
        arr = new int[n];
    }
    void read(){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            arr[i] = in.nextInt();
        }
    }
    void swap(){
        int max = arr[0], min = arr[0], max_index = 0, min_index = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
                max_index = i;
            }
            if(arr[i] < min){
                min = arr[i];
                min_index = i;
            }
        }
        int temp = arr[max_index];
        arr[max_index] = arr[min_index];
        arr[min_index] = temp;
    }
    void display(){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = in.nextInt();
        Number num = new Number(n);
        num.read();
        num.swap();
        num.display();
    }
}