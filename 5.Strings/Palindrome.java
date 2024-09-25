
import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
    
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "");
    
        int length = cleanedString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        if (isPalindrome(inputString)) {
            System.out.println("'" + inputString + "' is a palindrome.");
        } else {
            System.out.println("'" + inputString + "' is not a palindrome.");
        }

        scanner.close();
    }
}
