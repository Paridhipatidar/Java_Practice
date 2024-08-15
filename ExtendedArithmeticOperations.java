class ExtendedArithmeticOperations {
    public static void main(String[] args) {
        // Define variables of different data types
        int a = 10;             // Integer
        float b = 4.5f;         // Float
        short c = 20;           // Short
        long d = 100000L;       // Long
        String strNum = "Hello";   // String
        boolean isTrue = true;  // Boolean
        byte e = 50;            // Byte

        // Arithmetic Operations
        System.out.println("Arithmetic Operations:");

        // Addition of int and float
        float addition = a + b;
        System.out.println("int + float: " + a + " + " + b + " = " + addition);

        // Subtraction of long and short
        long subtraction = d - c;
        System.out.println("long - short: " + d + " - " + c + " = " + subtraction);

        // Multiplication of byte and int
        int multiplication = e * a;
        System.out.println("byte * int: " + e + " * " + a + " = " + multiplication);

        // Division of float by short
        float division = b / c;
        System.out.println("float / short: " + b + " / " + c + " = " + division);

        // Modulus of long by int
        long modulus = d % a;
        System.out.println("long % int: " + d + " % " + a + " = " + modulus);

        // Type Casting Examples
        System.out.println("\nType Casting:");

        // Integer to float
        float intToFloat = (float) a;
        System.out.println("int to float: (float) " + a + " = " + intToFloat);

        // Float to integer
        int floatToInt = (int) b;
        System.out.println("float to int: (int) " + b + " = " + floatToInt);

        // Short to int
        int shortToInt = c;
        System.out.println("short to int: " + c + " = " + shortToInt);

        // Long to int (might lose precision)
        int longToInt = (int) d;
        System.out.println("long to int: (int) " + d + " = " + longToInt);

        // String to int
        int strToInt = Integer.parseInt(strNum);
        System.out.println("String to int: Integer.parseInt('" + strNum + "') = " + strToInt);

        // String to float
        float strToFloat = Float.parseFloat(strNum);
        System.out.println("String to float: Float.parseFloat('" + strNum + "') = " + strToFloat);

        // Integer to String
        String intToStr = Integer.toString(a);
        System.out.println("int to String: Integer.toString(" + a + ") = '" + intToStr + "'");

        // Float to String
        String floatToStr = Float.toString(b);
        System.out.println("float to String: Float.toString(" + b + ") = '" + floatToStr + "'");

        // Boolean to String
        String booleanToStr = Boolean.toString(isTrue);
        System.out.println("boolean to String: Boolean.toString(" + isTrue + ") = '" + booleanToStr + "'");

        // Byte to int
        int byteToInt = e;
        System.out.println("byte to int: " + e + " = " + byteToInt);

        // Operations with Type Casting
        System.out.println("\nOperations with Type Casting:");

        // Adding a string representation of a number to an integer
        int result = a + Integer.parseInt(strNum);
        System.out.println("int + String (with casting): " + a + " + Integer.parseInt('" + strNum + "') = " + result);

        // Concatenating a string representation of a number with another string
        String resultStr = Integer.toString(a) + " + " + strNum + " = " + Integer.toString(result);
        System.out.println("String concatenation: " + resultStr);

        // Casting int to byte (might lose precision)
        byte intToByte = (byte) a;
        System.out.println("int to byte (with potential loss of data): (byte) " + a + " = " + intToByte);

        // Casting double to boolean is not directly possible in Java (thus not shown here)
    }
}
