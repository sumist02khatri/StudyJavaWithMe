package coreJava.string;

import java.util.*;

public class FrequencyOfString {
     public String characterFrequency(String s){
         char[] arr = s.toCharArray();
         Arrays.sort(arr);
         StringBuilder result = new StringBuilder();

         for (int i = 0; i <arr.length ; i++) {
             int cont = 0;

             boolean visit = false;

             for (int j = 0; j < i; j++) {
                 if (arr[j] == arr[i]) {
                     visit = true;
                     break;
                 }


             }
             if (visit){
                 continue;
             }

             for (int k = 0; k < arr.length; k++) {
                 if (arr[k] == arr[i]){
                     cont++;
                 }
             }

             result.append(arr[i]).append(cont).append(" ");
         }


         return result.toString();
     }

    public static void main(String[] args) {
        FrequencyOfString ob = new FrequencyOfString();
        System.out.println(ob.characterFrequency("banana"));



    }
}
