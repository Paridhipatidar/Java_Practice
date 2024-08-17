import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]){
        int f = 0; // First number
        int s = 1; // Second number
        int sum;

        System.out.println("Enter number of terms:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println(f); // Print the current Fibonacci number

            // Calculate the next number in the series
            sum = f + s;
            f = s;
            s = sum;
        }
        
        sc.close(); // Close the scanner
    }   
}
