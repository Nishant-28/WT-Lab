// Write a java program to implement a stack class having methods push () and pop(). These methods must be designed to throw user defined exception when the stack is empty or full.

import java.util.Scanner;

class StackEmptyException extends Exception{
    public StackEmptyException(String s){
        super(s);
    }
}

class StackFullException extends Exception{
    public StackFullException(String s){
        super(s);
    }
}

class Stack{
    private int[] arr;
    private int top;
    public Stack(int n){
        arr = new int[n];
        top = -1;
    }
    public void push(int n) throws StackFullException{
        if(top == arr.length - 1)
            throw new StackFullException("Stack is full");
        else
            arr[++top] = n;
    }
    public int pop() throws StackEmptyException{
        if(top == -1)
            throw new StackEmptyException("Stack is empty");
        else
            return arr[top--];
    }
}

class q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int n = sc.nextInt();
        Stack s = new Stack(n);
        System.out.println("Enter elements of stack: ");
        for(int i = 0; i < n; i++){
            try{
                s.push(sc.nextInt());
            }
            catch(StackFullException e){
                System.out.println(e);
            }
        }
        System.out.println("Elements of stack are: ");
        for(int i = 0; i < n; i++){
            try{
                System.out.println(s.pop());
            }
            catch(StackEmptyException e){
                System.out.println(e);
            }
        }
    }
}