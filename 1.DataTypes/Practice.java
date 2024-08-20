import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentIds = new String[5];
        int[] marks = new int[5];

      
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Student ID for student " + (i + 1) + ": ");
            studentIds[i] = scanner.nextLine();

            System.out.print("Enter Marks for student " + (i + 1) + " (leave empty for -1): ");
            String marksInput = scanner.nextLine();

           
            if (marksInput.isEmpty()) {
                marks[i] = -1;
            } else {
                marks[i] = Integer.parseInt(marksInput);
            }
        }

        System.out.println("\nStudents with marks -1:");
        for (int i = 0; i < 5; i++) {
            if (marks[i] == -1) {
                System.out.println("Student ID: " + studentIds[i]);
            }
        }
    }
}
