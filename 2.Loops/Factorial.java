import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the num to find factorial");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println("factorial of"+n+" is "+fact);

    }
}
