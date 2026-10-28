package coreJava.string;

import javax.swing.*;

public class Basic {
    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = new String("hello");
//        String s3 = "hello";
//        String s4 = new String("hello");
//
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s2==s4);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s2.equals(s4));



            char small = 'S';
            int l = small+32;
            System.out.println((char)l);

            String low = "SUMIST123";

        System.out.println(low.toLowerCase());

        for (int i = 0; i < low.length(); i++) {
            char ch = low.charAt(i);
//            if(ch>='A' && ch<='z') {
//                int n = ch + 32;
//                System.out.print((char) n);
//            }
//            else {
//                System.out.print(ch);
//            }
            if(Character.isDigit(ch)){
                System.out.print(ch);
            }else{
                int n = ch +32;
                System.out.print((char) n);
            }
        }

    }
}
