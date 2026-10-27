package coreJava.numberGame;

public class Fibonacci {
    public static void main(String[] args) {
        normalFibonacci();
//        checkFibonacci(18);
//        fibonacciUsingRecursion(10);
    }

    private static void normalFibonacci() {
        int n =10;
        int a = 0;
        int b = 1;
        int temp =0;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
             temp = a+b;
            a=b;
            b=temp;

        }

    }


    public static void checkFibonacci(int n){
        int a =0;
        int b =1;

        while(b<n){
            int temp=a+b;
            a=b;
            b=temp;
        }
        if (n==0||b==n){
            System.out.println("Fibonacci");
        }else {
            System.out.println(" Not Fibonacci");
        }

    }

    public static int fibonacciUsingRecursion(int n){
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacciUsingRecursion(n-1)+fibonacciUsingRecursion(n-2);
    }






}
