// Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate (length, width), box (length, width, height), wood box (length, width, height, thick)

import java.util.Scanner;

class plate
{
    int l, b;
    plate(int l, int b){
        this.l = l;
        this.b = b;
    }
}

class box extends plate
{
    int h;
    box(int l, int b, int h){
        super(l, b);
        this.h = h;
    }
}

class woodbox extends box
{
    int thick;
    woodbox(int l, int b, int h, int thick){
        super(l, b, h);
        this.thick = thick;
    }
}

public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b, h, thick;
        System.out.println("Enter length, breadth, height and thickness");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        thick = sc.nextInt();
        woodbox w = new woodbox(l, b, h, thick);
        System.out.println("Length: " + w.l + " Breadth: " + w.b + " Height: " + w.h + " Thickness: " + w.thick);
    }
}