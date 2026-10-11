package coreJava.numberGame;

public class LCM {
   public int lCM(int n1,int n2){
       int max = n1*n2;
       int i = 1;
       while(i<=max){
           if(i%n1==0&&i%n2==0){

               return i;

           }
           i++;

       }
       return i;
   }

    public static void main(String[] args) {
       LCM obj = new LCM();
        System.out.println(obj.lCM(4,6));


    }
}
