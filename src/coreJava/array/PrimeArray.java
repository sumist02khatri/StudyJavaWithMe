package coreJava.array;

public class PrimeArray {

    public static void primeArray(){
        int [] arr = {12,33,52,53,6,36,11,2};

        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            if (arr[i] < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }

                }
            }

            if (isPrime){
                System.out.println(arr[i]);
            }

        }

    }

    public static void primeFactorArray(){
        int [] arr = {12,33,52,53,6,36,11,2};
        for (int i = 0; i < arr.length; i++) {


        }

    }

    public static void main(String[] args) {


    }
}
