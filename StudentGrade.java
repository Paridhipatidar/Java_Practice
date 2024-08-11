import java.util.Scanner;
class Student {
    private int rollNo;
    private float Tmarks;
    private String name;
    void insert(int rollNo, float marks, String name) {
        this.rollNo = rollNo;
        this.Tmarks = marks;
        this.name = name;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("First Name: " + name);
        System.out.println("Marks: " + Tmarks);
    }
    void showGrade() {
        float per = Tmarks / 5;
        if (per >= 90) {
            System.out.println("Your grade: A+");
        } else if (per >= 80 && per < 90) {
            System.out.println("Your grade: A");
        } else if (per >= 70 && per < 80) {
            System.out.println("Your grade: B");
        } else if (per >= 60 && per < 70) {
            System.out.println("Your grade: C");
        } else if (per >= 50 && per < 60) {
            System.out.println("Your grade: D");
        } else if (per >= 40 && per < 50) {
            System.out.println("Your grade: E");
        } else {
            System.out.println("You have failed.");
        }
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Student();
            
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            
            System.out.print("Enter total marks (out of 500): ");
            float marks = sc.nextFloat();
            
            System.out.print("Enter first name: ");
            String name = sc.next();
            
            arr[i].insert(roll, marks, name);
            arr[i].display();
            arr[i].showGrade();
            System.out.println("---------------------");
        }
    }
}
