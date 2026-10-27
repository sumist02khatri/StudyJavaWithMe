package coreJava.array;

public class CheckArraySort {

    public static void checkSorted(int []arr){
        boolean ascending =true;
        boolean descending=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
               ascending=false;

            }
            if (arr[i]<arr[i+1]){
                descending=false;
            }
        }


        if (ascending){
            System.out.println("Sorted in Ascending Order");
        } else if (descending) {
            System.out.println("Sorted in Descending Order");

        } else {
            System.out.println("Unsorted");
        }

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int []arr1={5,4,3,2,1};
        int[]arr2={3,5,1,1,6,1};
        checkSorted(arr);

    }
}
