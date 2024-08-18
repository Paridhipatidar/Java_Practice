import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        int maxAttempts = 5;

        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("A random num is choosen between 1 to 100");
        System.out.println("Try to guess it within " + maxAttempts + " attempts.");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Your guess is low.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is high.");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations! You guessed the number correctly.");
        } else {
            System.out.println("Sorry, you ran out of attempts. The correct number was " + randomNumber + ".");
        }

        scanner.close();
    }
}
