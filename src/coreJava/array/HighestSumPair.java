package coreJava.array;

public class HighestSumPair {

public static void highestSumPair(int []arr){
    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];

        }else if(arr[i]>secondLargest) {
            secondLargest=arr[i];
        }
        sum=largest+secondLargest;
    }
    System.out.println("Highest Sum ="+largest+"+"+secondLargest +"="+sum);


}


    public static void main(String[] args) {
    int []arr ={12,2,3,4,5,6,14};
    highestSumPair(arr);
    }

}
