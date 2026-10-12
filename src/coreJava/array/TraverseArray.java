package coreJava.array;

public class TraverseArray {
    public static void addArray(){
        int [] arr = {2,4,2,2,1,4};
        int sum = 0;
        for(int num :arr){
            sum=sum+num;
            System.out.println(num);
        }
        System.out.println(sum);
    }

    public static void evenArray(){
        int [] arr = {12,33,52,53,11,34};
        for(int num : arr){
            if(num%2==0){
                System.out.println(num);
            }
        }

    }

    private static void printArray() {
        int [] arr = {12,34,52,52,11,34};
        for(int num :arr){
            System.out.println(num);

        }
    }
    private static void oddCountArray() {
        int [] arr = {12,31,55,52,11,34};
        int count= 0;
        for(int num :arr){
            if (num%2!=0){
                count++;
            System.out.println(num);
            }
        }
        System.out.println(count);
    }
    public static void divisibleArray(){
        int [] arr = {12,33,52,53,6,36};
        for(int num : arr){
            if(num%6==0){
                System.out.println(num);
            }
        }

    }

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




    public static void main(String[] args) {
        primeArray();

    }



}
