package coreJava.test;

public class Test3 {

    public static void palindromeWithPrimeDigit(){
        for (int i = 100; i <=500; i++) {
            int temp =i;
            int reverse =0;
            boolean prime= false;

            while(temp>0){
                int rem = temp%10;


                if(rem==2||rem==3||rem==5||rem==7){
                    prime=true;
                }
                reverse=reverse*10+rem;

                temp=temp/10;

            }
            if(reverse==i&&prime){
                System.out.println(i);
            }

        }
    }


    public static void checkFibonacci(int n){

         int a = 0;
         int b= 1;
         while(b<n){
             int temp = a+b;
             a=b;
             b=temp;
         }

         if (n==0||b==n){
             System.out.println("Fibonacci number");

         }else {
             System.out.println("Not fibonacci number");
         }
    }


    public static void factorialOfEvenDigit(int n){

        while(n>0){
           int rem= n%10;
           if(rem%2==0){
               int fact=1;
               for (int i = 1; i <= rem; i++) {

                   fact=fact*i;

               }

               System.out.println(rem +"! ="+fact);
           }
           n=n/10;


        }

    }



    public static void main(String[] args) {
//        palindromeWithPrimeDigit();

        checkFibonacci(10);
//        factorialOfEvenDigit(5423);
    }
}
