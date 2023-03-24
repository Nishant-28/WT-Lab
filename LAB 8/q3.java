
import java.util.Scanner;

interface Salary
{
    void earnings();
    void deductions();
    void bonus();
}

class Manager implements Salary
{
    int basic;
    public void earnings()
    {
        System.out.println("Earnings of Manager is " + (basic + (0.8 * basic) + (0.15 * basic)));
    }
    public void deductions()
    {
        System.out.println("Deductions of Manager is " + (0.12 * basic));
    }
    public void bonus()
    {
        System.out.println("Bonus of Manager is " + (0.5 * basic));
    }
}

class SubStaff extends Manager
{
    public void bonus()
    {
        System.out.println("Bonus of SubStaff is " + (0.5 * basic));
    }
}

public class q3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the basic salary of Manager: ");
        int basic = scanner.nextInt();
        Manager obj = new Manager();
        obj.basic = basic;
        obj.earnings();
        obj.deductions();
        obj.bonus();
        System.out.println("Enter the basic salary of SubStaff: ");
        basic = scanner.nextInt();
        SubStaff obj1 = new SubStaff();
        obj1.basic = basic;
        obj1.earnings();
        obj1.deductions();
        obj1.bonus();
    }
}
