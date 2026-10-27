package coreJava.array;

import java.util.Arrays;

public class ArrayLeftShift {
    public static void arrayLeftShift(int []arr){
        int n = 3;
        while(n>0){
            int temp =arr[0];
            for (int i = 0; i <= arr.length-1; i++) {
                if (i == arr.length-1){
                    arr[i]=temp;
                }else {
                    arr[i]=arr[i+1];
                }

            }
            System.out.println(Arrays.toString(arr));
            n--;
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        arrayLeftShift(arr);
    }
}
