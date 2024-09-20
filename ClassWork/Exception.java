public class Exception {

        public static void main(String[] args) {
            int numerator = 10;
            int denominator = 0;
            int result = 0;
    
            try {
                result = numerator / denominator;
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            } finally {
               
                System.out.println("Division operation completed.");
            }
    
            System.out.println("Result: " + result);
        }
    }
       

