package coreJava.array;

import java.util.Arrays;

public class LargestElementInArray {

    public static void largestElementInArray(int []arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest ){
                largest=arr[i];

            }
        }
        System.out.println(Arrays.toString(arr)+" "+largest);


    }

    public static void smallestElementInArray(int []arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min ){
                min=arr[i];

            }
        }
        System.out.println(Arrays.toString(arr)+" "+min);


    }

    public static void largestEvenElementInArray(int []arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest && arr[i]%2==0){
                largest=arr[i];

            }
        }
        System.out.println(Arrays.toString(arr)+" "+largest);


    }
    public static void main(String[] args) {
        int []arr1 ={2,31,31,35,67,1};
        smallestElementInArray(arr1);

    }
}
