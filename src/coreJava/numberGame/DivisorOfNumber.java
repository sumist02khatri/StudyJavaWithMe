package coreJava.numberGame;


public class DivisorOfNumber {
    public void divisor(int n){

        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                System.out.println(i);

//
            }


        }


    }

    public static void main(String[] args) {
        DivisorOfNumber obj = new DivisorOfNumber();
        obj.divisor(6);


    }
}
