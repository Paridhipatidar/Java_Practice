 public class Student {
    private String name;
    private int rollNumber;
    private double[] marks;

    // Constructor
    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the average marks
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Marks: " + calculateAverage());
    }

    // Main method for testing
    public static void main(String[] args) {
        double[] marks = {85.5, 90.0, 78.5, 88.0, 92.5};
        Student student = new Student("Alice", 101, marks);
        student.displayDetails();
    }
}
