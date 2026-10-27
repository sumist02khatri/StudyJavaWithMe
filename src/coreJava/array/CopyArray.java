package coreJava.array;

import java.util.Arrays;

public class CopyArray {

    public static void copyArray(){
        int [] arr={12,3,13,453,13,452,123,212};
        int [] arr2 = Arrays.copyOf(arr,arr.length+1);
//        int [] arr2= arr;
        for(int num : arr2){
            System.out.println(num);
        }
    }

    public static void copyArray2(){
        int [] arr={12,3,13,453,13,452,123,212};
        int [] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr2));
    }


    public static void copyEvenArray(){
        int [] arr={12,3,13,453,13,452,123,212};
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                n++;

            }
        }

        int [] arr2 = new int[n];
        int j =0;
//        int i = 0;
//        int j = 0;
//        while (true)  {
//            if (arr[i]%2==0){
//                arr2[j]=arr[i];
//                j++;
//            }else {
//                     i++;
//                 }
//
//
//
//        }
        for (int i = 0; i < arr.length ;i++) {
            if (arr[i]%2==0) {
                arr2[j]=arr[i];
                j++;

            }

        }





        System.out.println(Arrays.toString(arr2));
    }



    public static void main(String[] args) {
        copyEvenArray();
    }
}
