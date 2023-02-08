import java.util.Scanner;
class Rectangle{
    int length , breadth;
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        length = sc.nextInt();
        breadth = sc.nextInt();
    }
    void calculate(){
        System.out.println("Area : "+(length*breadth));
        System.out.println("Perimeter : "+(2*(length+breadth)));
    }
}

public class q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
    }
}