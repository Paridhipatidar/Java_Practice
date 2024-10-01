import java.util.Scanner;

public class SubstringReplacer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the substring to find: ");
        String substringToFind = scanner.nextLine();

        System.out.print("Enter the substring to replace with: ");
        String replacementString = scanner.nextLine();

        String modifiedString = originalString.replace(substringToFind, replacementString);

        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }
}
