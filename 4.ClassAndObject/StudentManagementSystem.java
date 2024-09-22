import java.util.ArrayList;
import java.util.Scanner;

// Studentp class to store student details
class Studentp {
    private int id;
    private String name;
    private String department;

    // Constructor
    public Studentp(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

// Main class to manage the student system
public class StudentManagementSystem {
    private static ArrayList<Studentp> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Method to add a student
    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the newline

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        Studentp student = new Studentp(id, name, department);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    // Method to update student details
    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the newline

        for (Studentp student : studentList) {
            if (student.getId() == id) {
                System.out.print("Enter New Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter New Department: ");
                String newDept = scanner.nextLine();

                student.setName(newName);
                student.setDepartment(newDept);
                System.out.println("Student details updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Method to display all student details
    public static void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Studentp student : studentList) {
                student.displayStudentDetails();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
