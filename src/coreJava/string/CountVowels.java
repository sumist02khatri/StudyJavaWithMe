package coreJava.string;

public class CountVowels {
    public static void main(String[] args) {
        String s = "hello my dear friend how are you ";
        int vowels = 0;

        char [] ch = s.toCharArray();
        for (char c : ch){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
                System.out.print(c+" ");
            }

        }
        System.out.println();
        System.out.println(vowels);

    }
}
