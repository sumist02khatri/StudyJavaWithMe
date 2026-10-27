package coreJava.string;

public class ExtractVowels {
    public static void main(String[] args) {
        char[]a={'a','b','e','u','h','z','i','o'};
        for (int i = 0; i < a.length; i++) {

            if (a[i]=='a'|| a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
                System.out.println(a[i]);
            }

        }
    }
}
