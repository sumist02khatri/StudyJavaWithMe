package coreJava.string;

import java.util.Arrays;

public class FrequencyOfStringOptimise {
     public String characterFrequency(String s){

         int [] freq = new int[26];

         for(char c :s.toCharArray()){
             freq[c-'a']++;
         }

         StringBuilder result = new StringBuilder();

         for (int i = 0; i < 26; i++) {
             if(freq[i]>0){
                 if(result.length()>0){
                     result.append(" ");
                 }

                 result.append((char)('a'+i)).append(freq[i]);
             }

         }





         return result.toString();
     }

    public static void main(String[] args) {
        FrequencyOfStringOptimise ob = new FrequencyOfStringOptimise();
        System.out.println(ob.characterFrequency("banana"));
        System.out.println(ob.characterFrequency("takeuforward"));



    }
}
