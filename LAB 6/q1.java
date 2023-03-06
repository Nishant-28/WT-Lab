import java.util.Scanner;

class Shape2D {
    protected int l, b, a, cal;

    Shape2D(int l, int b) {
        this.l = l;
        this.b = b;
        a = l * b;
    }

    void calculate() {
        cal = a * 40;
        System.out.println("Cost of Plastic for 2D is Rs " + cal);
    }
}

class Shape3D extends Shape2D {
    int h, cal;

    Shape3D(int l, int b, int heihjt) {
        super(l, b);
        h = heihjt;
        a = l * b * h;
    }

    void calculate() {
        cal = 2 * (l * b + b * h + h * l);
        cal = cal * 60;
        System.out.println("Cost of Plastic for 3D is Rs " + cal);
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, l, b, h;
        System.out.println("Enter the dimensions \n1. 2D \n2. 3D");
        switch (choice = sc.nextInt()) {
            case 1:
                System.out.println("Enter length and breadth");
                l = sc.nextInt();
                b = sc.nextInt();
                Shape2D s1 = new Shape2D(l,b);
                s1.calculate();
                break;
            case 2:
                System.out.println("Enter length and breadth and height");
                l = sc.nextInt();
                b = sc.nextInt();
                h = sc.nextInt();
                Shape3D s2 = new Shape3D(l, b, h);
                s2.calculate();
                break;
        }
    }
}
