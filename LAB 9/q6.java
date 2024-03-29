
import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String s){
        super(s);
    }
}

class q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        try{
            if(n < 0)
                throw new NegativeNumberException("Number is negative");
            else
                System.out.println("Number is positive");
        }
        catch(NegativeNumberException e){
            System.out.println(e);
        }
    }
}