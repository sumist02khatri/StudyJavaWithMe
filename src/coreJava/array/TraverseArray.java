package coreJava.array;

import java.util.Arrays;

public class TraverseArray {
    public static void addArray(){
            int [] arr = {2,4,2,2,1,4};
            int sum = 0;
            for(int num :arr){
                sum=sum+num;
                System.out.println(num);
            }
            System.out.println(sum);
    }

    public static void evenArray(){
        int [] arr = {12,33,52,53,11,34};
        for(int num : arr){
            if(num%2==0){
                System.out.println(num);
            }
        }

    }

    private static void printArray() {
        int [] arr = {12,34,52,52,11,34};
        for(int num :arr){
            System.out.println(num);

        }
    }
    private static void oddCountArray() {
        int [] arr = {12,31,55,52,11,34};
        int count= 0;
        for(int num :arr){
            if (num%2!=0){
                count++;
            System.out.println(num);
            }
        }
        System.out.println(count);
    }
    public static void divisibleArray(){
        int [] arr = {12,33,52,53,6,36};
        for(int num : arr){
            if(num%6==0){
                System.out.println(num);
            }
        }

    }
    public static void reverseArray(){
        int [] arr={12,3,13,453,13,452,123,212};
        for (int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }

    public static void inPlaceReverseArray(){
        int [] arr={12,3,13,453,13,452,123,212};
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

        for(int num: arr){
        System.out.println(num);
        }

    }




    public static void main(String[] args) {


    }



}
