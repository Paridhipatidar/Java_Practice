import java.util.ArrayList;

/**
 *
 * @author parid
 */
public class CpyAry {
 
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        ArrayList<Integer> arr2= new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            arr2.add(arr1[i]);
        }
        System.out.println(arr2);
    }
}