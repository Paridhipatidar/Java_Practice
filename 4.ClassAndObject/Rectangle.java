public class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Main method for testing
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area: " + rect.calculateArea());         // Output: Area: 50.0
        System.out.println("Perimeter: " + rect.calculatePerimeter()); // Output: Perimeter: 30.0
    }
}
