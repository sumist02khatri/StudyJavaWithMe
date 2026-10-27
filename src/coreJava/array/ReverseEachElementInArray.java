package coreJava.array;

public class ReverseEachElementInArray {

   public static void reverseEachElementInArray(){
       int []arr={123,24198,32,56,21,743,12,13};
       for (int i = 0; i < arr.length; i++) {
           int rev=0;
           int n=arr[i];
           while (n>0){
               int digit=n%10;
               rev=rev*10+digit;
               n=n/10;

           }
           arr[i]=rev;

       }
       for (int num:arr){
           System.out.println(num);
       }
   }


    public static void main(String[] args) {
        reverseEachElementInArray();
    }
}
