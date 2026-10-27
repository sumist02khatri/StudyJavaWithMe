package coreJava.array;

public class CommonElement {

    public static void commonElement(){
        int []arr={1,2,3,4,5,55};
        int []arr2={1,2,5,6,23,42,15,121,55};
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr2.length-1; j++) {
                if (arr[i]==arr2[j]){
                    System.out.println(arr[i]+" ");
                    break;
                }
            }

        }
    }
    public static void main(String[] args) {
        commonElement();
    }}
