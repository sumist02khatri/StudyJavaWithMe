package coreJava.array;

import java.util.HashMap;

public class SumEqualToTargetElement {
    public static void sum( int []arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int compliment=target-arr[i];
            if (map.containsKey(compliment)){
                int index =map.get(compliment);
                System.out.println("Index: " + index + ", " + i);
                System.out.println(compliment+"+"+arr[i]+ " ="+target);
            }else {
                map.put(arr[i],i );
            }

        }





    }

    public static void main(String[] args) {
        int []arr={1,2,3,5,8,34,2,9};
        int target = 17;
        sum(arr,target);
    }
}
