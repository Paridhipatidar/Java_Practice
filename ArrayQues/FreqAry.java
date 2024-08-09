public class FreqAry {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        System.out.println("Element Frequency:");
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = 0; 
                }
            }
            if (array[i] != 0) {
                System.out.println(array[i] + ": " + count);
            }
        }
    }
}
