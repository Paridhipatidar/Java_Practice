import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the paragraph
        System.out.println("Enter a paragraph: ");
        String paragraph = scanner.nextLine();

        // Call the method to analyze and highlight the text
        analyzeText(paragraph);

        scanner.close();
    }

    public static void analyzeText(String text) {
        // Convert the text to lowercase and split it into words
        String[] words = text.toLowerCase().split("\\W+");

        // Create a HashMap to store word frequency
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Find the most frequent word
        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        // Print the frequency of all words
        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Highlight and print the most frequent word
        System.out.println("\nMost Frequent Word: \"" + mostFrequentWord + "\" appears " + maxFrequency + " times.");
        System.out.println("\nText with most frequent word highlighted:");
        
        // Highlight the most frequent word in the text (making it uppercase for emphasis)
        String highlightedText = text.replaceAll("(?i)\\b" + mostFrequentWord + "\\b", mostFrequentWord.toUpperCase());
        System.out.println(highlightedText);
    }
}
