//  ﻿﻿﻿﻿Java to Program Find 2nd Smallest Number in an array


class SecondSmallest{
      public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        
        if (arr.length < 2) {
            System.out.println("Array has fewer than 2 elements.");
            return;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else  if (arr[i] < second && arr[i] != first)  {
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) {
            System.out.println("There is no second min element.");
        } else {
            System.out.println("The second min element is: " + second);
        }
    } 
}