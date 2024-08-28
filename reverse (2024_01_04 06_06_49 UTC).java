import java.util.Scanner;
class reverse{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n,rev=0;
        System.out.println("enter no to find rev");
        n=s.nextInt();
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println("rev="+rev);
    }
}