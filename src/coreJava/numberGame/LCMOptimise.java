package coreJava.numberGame;

public class LCMOptimise {
   public int lCM(int n1,int n2){
       int n =Math.abs(n1);
       int m =Math.abs(n2);
       int gcd =0;
       while(n2!=0){
           int rem = n1%n2;
           n1=n2;
           n2=rem;
       }
       gcd=n1;

       return (n/gcd)*m;


   }

    public static void main(String[] args) {
       LCMOptimise obj = new LCMOptimise();
        System.out.println(obj.lCM(4,6));


    }
}
