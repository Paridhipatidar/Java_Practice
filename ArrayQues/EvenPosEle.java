// Java Program to print the elements of an array present on even position

class EvenPosEle{
public static void main (String args[]){
    int arr[]={1,2,3,4,5};
    for(int i=1;i<arr.length;i+=2){
        System.out.println(arr[i]);
    }
}
}