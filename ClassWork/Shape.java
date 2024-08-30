abstract class Shapes {
    String color;

    abstract double area();
    public abstract String toString();

    public Shapes(String color) {
        System.out.println("Shape constructor");
        this.color = color;
    }
}

class Circle extends Shapes {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor");
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle color is " + color + " and area is " + area();
    }
}

public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        System.out.println(circle.toString());
    }
}

