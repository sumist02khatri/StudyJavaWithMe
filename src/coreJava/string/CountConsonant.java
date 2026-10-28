package coreJava.string;

public class CountConsonant {
    public static void main(String[] args) {
        String s = "hello my dear friend how are you";
        int consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u' &&c>='a'&&c<='z'){
                consonant++;
                System.out.print(c+" ");
            }

        }
        System.out.println();
        System.out.println(consonant);
    }
}
