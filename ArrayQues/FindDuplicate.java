class FindDuplicate {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < array.length; i++) {
          
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}
