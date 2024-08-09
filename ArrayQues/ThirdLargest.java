// Java Program to Find 3rd Largest Number in an array
class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Handle edge case: if there are fewer than 3 elements
        if (arr.length < 3) {
            System.out.println("Array has fewer than 3 elements.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }
        if (third == Integer.MIN_VALUE) {
            System.out.println("There is no third largest element.");
        } else {
            System.out.println("The third largest element is: " + third);
        }
    }
}
