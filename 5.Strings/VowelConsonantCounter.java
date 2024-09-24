import java.util.Scanner;

public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String s) {
        s = s.toLowerCase();
        int vowelCount = 0, consonantCount = 0;

        String vowels = "aeiou";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                  
                    vowelCount++;
                } else {
                    
                    consonantCount++;
                }
            }
        }

         
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Count vowels and consonants
        countVowelsAndConsonants(inputString);

        scanner.close();
    }
}

