package coreJava.numberGame;

public class GCD {
    public int gCD(int n1,int n2){
        int min = Math.min(n1, n2);

        for (int i = min; i>=1 ; i--) {
            if (n1%i==0 && n2%i==0) {
                return i;

            }

        }
        return 1;

    }

    public static void main(String[] args) {
        GCD obj = new GCD();
        System.out.println(obj.gCD(12,18));
    }
}
