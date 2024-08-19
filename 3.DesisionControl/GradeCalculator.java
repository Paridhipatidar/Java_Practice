import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();
        char grade;

        // Calculate grade based on marks using switch case
        int category = marks / 10;

        switch (category) {
            case 10: // This case handles 100 as well
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println("The student's grade is: " + grade);
    }
}
