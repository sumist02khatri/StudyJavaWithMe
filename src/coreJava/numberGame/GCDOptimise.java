package coreJava.numberGame;

public class GCDOptimise {
    public int gCD(int n1,int n2){
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        while (n2!=0) {
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        return n1;

    }




    public static void main(String[] args) {
        GCDOptimise obj = new GCDOptimise();
        System.out.println(obj.gCD(12,18));
    }
}
