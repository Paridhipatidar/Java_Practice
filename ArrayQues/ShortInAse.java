// 11. Java Program to sort the elements of an array in ascending order 

import java.util.Arrays;

class ShortInAse {
    public static void main(String[] args) {
        int[] arr = {4,2, 3,5,1};
        
        // Sort the array
        Arrays.sort(arr);
        
        // Print all elements of the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
