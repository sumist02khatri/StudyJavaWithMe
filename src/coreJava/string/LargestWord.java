package coreJava.string;

public class LargestWord {
    public static void main(String[] args) {
        String [] a={"smith","bye","hello","nice","elephant"};

        String max=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i].length()>max.length()){
                max=a[i];
            }

        }
        System.out.println("largest Word: "+max);
    }
}
