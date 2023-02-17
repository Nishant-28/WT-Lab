// create an stack which store 5 enter by user and display it and check for overflow condition
import java.util.Scanner;
class Stack {
    int[] arr;
    int top;
    Stack(){
        arr = new int[5];
        top = -1;
    }
    void push(int x){
        if(top == 4){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            arr[top] = x;
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else{
            top--;
        }
    }
    void display(){
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else{
            for(int i=0; i<=top; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}