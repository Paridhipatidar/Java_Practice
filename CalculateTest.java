class Calculation{
    void fact(int n){
        int f=1;
        for (int i =1;i<=n;i++)
        f=f*i;
        System.out.println("Factorial is"+f);
    }
}
public class CalculateTest{
    public static void main(String args[]){
        new Calculation().fact(10);
        // c.fact;
    }
}