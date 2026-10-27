package dsa;

public class BuySell {
    public static int buySell( int []arr,int c, int r){
         int maxProfit=0;
         int n = arr.length;

        for (int i = 0; i <= n-1; i++) {

            for (int j = i+c; j<=i+r ; j++) {
                if (j < n){
                    int profit= arr[j]-arr[i];

                    maxProfit=Math.max(maxProfit,profit);
                }

            }

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int [] arr={10, 7, 15, 8, 20, 12, 25};
        int c= 2;
        int r=3;
        System.out.println(buySell(arr,c,r));

    }
}
