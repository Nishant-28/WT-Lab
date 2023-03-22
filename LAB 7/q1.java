// Illustrate the usage of abstract class with following Java classes 
// i) An abstract class “student” with data member roll no, reg no and an abstract method course()
// ii) A subclass “kiitian” with course() method implementation

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the student: ");
            String name = scanner.next();
            System.out.println("Enter the roll number of the student: ");
            int rollNumber = scanner.nextInt();
            System.out.println("Enter the registration number of the student: ");
            int registrationNumber = scanner.nextInt();
            System.out.println("Enter the course of the student: ");
            String course = scanner.next();
            students[i] = new KIITian(name, rollNumber, registrationNumber, course);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].getName() + " " + students[i].getRollNumber() + " "
                    + students[i].getRegistrationNumber() + " " + ((KIITian) students[i]).getCourse());
        }
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int registrationNumber;

    public Student(String name, int rollNumber, int registrationNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
}

class KIITian extends Student {
    private String course;

    public KIITian(String name, int rollNumber, int registrationNumber, String course) {
        super(name, rollNumber, registrationNumber);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}