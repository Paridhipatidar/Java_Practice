public class Complex {
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to get a string representation of the complex number
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, -5);

        System.out.println("c1: " + c1);        // Output: c1: 2 + 3i
        System.out.println("c2: " + c2);        // Output: c2: 4 - 5i

        Complex c3 = c1.add(c2);
        System.out.println("c1 + c2: " + c3);  // Output: c1 + c2: 6 - 2i

        Complex c4 = c1.subtract(c2);
        System.out.println("c1 - c2: " + c4);  // Output: c1 - c2: -2 + 8i
    }
}
