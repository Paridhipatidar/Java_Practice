public class DataTypesDemo {
    public static void main(String[] args) {

        // Integer
        int age = 25;
        // int age = 25;: This declares an integer variable age and initializes it with the value 25. The int type is a primitive data type representing a 32-bit signed integer.
        System.out.println("Age: " + age);
        System.out.println("Type: " + ((Object)age).getClass().getSimpleName());
        // System.out.println("Type: " + ((Object)age).getClass().getSimpleName());: Since int is a primitive type, it cannot directly call methods like getClass(). By casting age to Object, it is boxed into an Integer object, allowing the use of the getClass() method to retrieve the type. getSimpleName() returns the name of the class as a String, which in this case is "Integer".


        // Float
        float height = 5.9f;
        // float height = 5.9f;: This declares a float variable height and initializes it with the value 5.9. The f suffix is required to indicate that this is a float literal (otherwise, it would be considered a double by default).
        System.out.println("\nHeight: " + height);
        // System.out.println("Type: " + ((Object)height).getClass().getSimpleName());: Similar to the integer case, height is cast to Object, which allows using getClass() to determine that the type is "Float".
        System.out.println("Type: " + ((Object)height).getClass().getSimpleName());

        // String
        String name = "John Doe";
        // String name = "John Doe";: This declares a String variable name and initializes it with the value "John Doe". String is a class in Java that represents a sequence of characters.
        System.out.println("\nName: " + name);
        // System.out.println("Type: " + name.getClass().getSimpleName());: Since String is already an object, there's no need for casting. getClass().getSimpleName() directly returns "String".
        System.out.println("Type: " + name.getClass().getSimpleName());

        // Boolean
        boolean isStudent = true;
        // boolean isStudent = true;: This declares a boolean variable isStudent and initializes it with the value true. The boolean type can hold either true or false.
        System.out.println("\nIs Student: " + isStudent);
        // System.out.println("Type: " + ((Object)isStudent).getClass().getSimpleName());: Similar to the integer and float cases, isStudent is cast to Object, allowing the use of getClass() to determine that the type is "Boolean".
        System.out.println("Type: " + ((Object)isStudent).getClass().getSimpleName());

        // Array
        String[] fruits = {"apple", "banana", "cherry"};
        // String[] fruits = {"apple", "banana", "cherry"};: This declares an array of String named fruits and initializes it with three elements: "apple", "banana", and "cherry".
        System.out.println("\nFruits: ");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // System.out.println("Type: " + fruits.getClass().getSimpleName());: The getClass() method is called on the fruits array. The getSimpleName() method will return "String[]" since fruits is an array of String.
        System.out.println("Type: " + fruits.getClass().getSimpleName());
    }
}
