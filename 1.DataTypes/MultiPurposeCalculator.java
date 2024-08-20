import java.util.Scanner;

public class MultiPurposeCalculator {

    // Basic Arithmetic Operations
    public static void basicArithmetic() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Arithmetic Operations");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
    }

    // Calculate Area of Shapes
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate Area");
        System.out.println("Choose shape: 1. Circle  2. Rectangle  3. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Area of Circle: πr²
                System.out.print("Enter radius of the circle: ");
                float radius = scanner.nextFloat();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of the Circle: " + circleArea);
                break;

            case 2:
                // Area of Rectangle: length * width
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of the Rectangle: " + rectangleArea);
                break;

            case 3:
                // Area of Triangle: 0.5 * base * height
                System.out.print("Enter base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the Triangle: " + triangleArea);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    // Calculate Volume of Shapes
    public static void calculateVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate Volume");
        System.out.println("Choose shape: 1. Cube  2. Sphere  3. Cylinder");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Volume of Cube: side³
                System.out.print("Enter side of the cube: ");
                int side = scanner.nextInt();
                int cubeVolume = side * side * side;
                System.out.println("Volume of the Cube: " + cubeVolume);
                break;

            case 2:
                // Volume of Sphere: 4/3 * πr³
                System.out.print("Enter radius of the sphere: ");
                float radius = scanner.nextFloat();
                double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                System.out.println("Volume of the Sphere: " + sphereVolume);
                break;

            case 3:
                // Volume of Cylinder: πr²h
                System.out.print("Enter radius of the cylinder: ");
                double r = scanner.nextDouble();
                System.out.print("Enter height of the cylinder: ");
                double h = scanner.nextDouble();
                double cylinderVolume = Math.PI * Math.pow(r, 2) * h;
                System.out.println("Volume of the Cylinder: " + cylinderVolume);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMulti-Purpose Calculator");
            System.out.println("1. Basic Arithmetic Operations");
            System.out.println("2. Calculate Area of Shapes");
            System.out.println("3. Calculate Volume of Shapes");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    basicArithmetic();
                    break;

                case 2:
                    calculateArea();
                    break;

                case 3:
                    calculateVolume();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }
}

