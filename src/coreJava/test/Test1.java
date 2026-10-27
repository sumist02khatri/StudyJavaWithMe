package coreJava.test;

public class Test1 {
    public static void main(String[] args) {

//        largestAmongThree();
//        factorialOfPrimeDigit();
//        happyNumber();
        singleDigitArmstrong();
    }



    public static void singleDigitArmstrong(){
        for (int i = 0; i <=153 ; i++) {
            int temp =i;
            int sum=0;
            int count= 0;
            while(temp>0){
                int rem = temp%10;
                count++;


                temp=temp/10;

            }
            temp=i;
            while(temp>0){
                int rem = temp%10;
                sum= sum +(int)Math.pow(rem,count);



                temp=temp/10;

            }

            if(sum==i){
                System.out.println(i);
            }

        }

    }

    public static void happyNumber(){
        for (int i = 1; i <=100 ; i++) {

            int temp = i;
            while(temp!=1&&temp!=4){
            int sum = 0;
            while(temp>0) {
                int rem = temp % 10;
                sum = sum+rem * rem;
                temp = temp / 10;
            }
            temp=sum;

            }

            if (temp==1){
                System.out.println(i);
            }

        }


    }


    public static void factorialOfPrimeDigit(){
        int n = 49563;
        while(n>0){
            int rem = n%10;
            boolean prime = true;
            int fact = 1;
            if (rem <2){
                prime=false;
            }
            for (int i = 2; i*i <=rem ; i++) {
                if (rem%i==0){
                    prime = false;
                    break;
                }

            }
            if (prime){

                for (int i = 1; i <= rem; i++) {

                    fact=fact*i;

                }
                System.out.println(rem + "! = " + fact);


            }
            n=n/10;

        }
    }
    private static void largestAmongThree() {
        int a = 66;
        int b = 13;
        int c = 5;
        int largest = (a>b?a:b)>c?(a>b?a:b):c;
        System.out.println("the largest among three:"+largest);
    }
}
