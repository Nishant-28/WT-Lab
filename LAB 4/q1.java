import java.util.Scanner;
class Box{
    int length , width , height;
    void demo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("length");
        length = sc.nextInt();
        System.out.println(" width");
        width = sc.nextInt();
        System.out.println("height");
        height = sc.nextInt();
    }
    void volume()
    {
        System.out.println("volume is "+(length*width*height));
    }
}

public class q1 {
    public static void main(String[] args) {
        Box b = new Box();
        b.demo();
        b.volume();
    }
}