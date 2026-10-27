package coreJava.array;

import java.util.Arrays;

public class PrintPalindromeInArray {
    public static void printPalindromeInArray(){
        int []arr={121,321,444,323,565,12,5,31,51,5234,211};
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int rev = 0;
            while(n>0){
                int digit = n%10;
                rev=rev*10+digit;
                n=n/10;
            }
            if(rev==arr[i]) {
                System.out.println(arr[i]);

            }

        }


    }


    public static void main(String[] args) {
        printPalindromeInArray();

    }
}
