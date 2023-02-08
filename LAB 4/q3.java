import java.util.Scanner;
class Student
{
    int roll;
    String name;
    float cgpa;
    Student(int r, String n, float c)
    {
        roll = r;
        name = n;
        cgpa = c;
    }
}

public class q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the roll number of student " + (i+1) + ": ");
            int r = sc.nextInt();
            System.out.print("Enter the name of student " + (i+1) + ": ");
            String name = sc.next();
            System.out.print("Enter the cgpa of student " + (i+1) + ": ");
            float c = sc.nextFloat();
            s[i] = new Student(r, name, c);
        }
        float min = s[0].cgpa;
        int index = 0;
        for(int i=1; i<n; i++)
        {
            if(s[i].cgpa < min)
            {
                min = s[i].cgpa;
                index = i;
            }
        }
        System.out.println("name of the student with lowest cgpa is " + s[index].name);
    }
}