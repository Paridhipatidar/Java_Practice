// 6. ﻿﻿﻿Java Program to print the largest element in an array

class LargestEle{
public static void main (String args[]){
    int arr[]={1,2,3,4,5};
    int max=0;
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }   
      }
      System.out.print(max);
   }
}