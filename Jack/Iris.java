public class Iris
{
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final String name;

    Iris(double a, double b, double c, double d, String name)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name= name;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getD(){
        return d;
    }

    public String getname(){
        return name;
    }

    public String toString(){
        return a + " " + b + " " + c + " " + d + " " + name;
    }

}