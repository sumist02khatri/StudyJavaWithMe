package coreJava.array;

import java.util.Arrays;

public class ArrayRightShift {
    public static void arrayRightShift(int [] arr){
        int n = 3;
         while(n>0) {

             int temp = arr[arr.length - 1];
             for (int i = arr.length - 1; i >= 0; i--) {

                 if (i == 0) {
                     arr[i] = temp;
                 } else {
                     arr[i] = arr[i - 1];
                 }
             }
             System.out.println(Arrays.toString(arr));
             n--;
         }
    }

    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
        arrayRightShift(arr);
    }
}
