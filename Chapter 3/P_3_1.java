import java.util.Scanner;

public class P_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int purchase;
        System.out.println("Enter the amount of purchased : ");
        purchase = in.nextInt();

        if(purchase>=5000){
            System.out.println("Purchase Amount = " + purchase);
            System.out.println("Discount Amount = " + purchase*.1);
            System.out.println("Final Amount    = " + (purchase-(purchase*.1)));
        }
    }
}