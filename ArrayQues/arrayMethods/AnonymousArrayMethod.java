package arrayMethods;

// Java program to demostrate the way of passing ana anonymous array to method

public class AnonymousArrayMethod {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        printArray(new int[] { 10, 22, 34, 32 });
    }
}
