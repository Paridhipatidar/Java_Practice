// 10. ﻿﻿﻿﻿Java Program to right rotate the elements of an array 

public class RightRotate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to rotate

        // Perform right rotation
        rightRotate(array, k);

        // Print the rotated array
        System.out.println("Array after right rotation:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    public static void rightRotate(int[] array, int k) {
        int n = array.length;
        k = k % n; // Normalize k to avoid unnecessary rotations
        
        if (k == 0) return; // No rotation needed

        // a temporary array to hold rotated values
        int[] temp = new int[n];
        
        // Copy elements to the temporary array
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = array[i];
        }

        // Copy back the rotated elements to the original array
        System.arraycopy(temp, 0, array, 0, n);
    }
}
