package coreJava.string;

public class Count {
    public static void count(String s){
        int letter = 0;
        int digit = 0;
        int special = 0;

        char[] c = s.toCharArray();
        for (char ch : c){
//            if (Character.isDigit(ch)){
//                digit++;
//            } else if (Character.isLetter(ch)) {
//                letter++;
//
//            }
//            else {
//                special++;
//            }
            if (ch>='a'&&ch<='z'){
                letter++;
            } else if (ch>='0' &&ch<'9') {
                digit++;
                
            }else {
                special++;
            }

        }
        System.out.println("Letter: "+letter);
        System.out.println("Digit: "+digit);
        System.out.println("Special Character: "+special);

    }

    public static void main(String[] args) {
        String s="smith0812@gmail.com";
        count(s);
    }

}
