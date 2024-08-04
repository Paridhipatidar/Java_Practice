import java.util.Scanner;

public class CalPer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your marks of 5 subjects:");
        int sum = 0;
        int total = 500;
        
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            sum = sum + a;
        }
        
        double per = (sum / (double)total) * 100;
        System.out.println("Percentage = " + per + "%");
        
        sc.close();
    }
}
