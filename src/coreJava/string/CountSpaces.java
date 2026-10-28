package coreJava.string;

public class CountSpaces {
    public static void main(String[] args) {
        String s = " hi my self sumist kumar";
        int space = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);
//            if(Character.isSpace(ch)){
//                space++;
//                System.out.print(i+" ");
//            }
            if(ch==' '){
                space++;
                System.out.print(i+" ");
            }



        }
        System.out.println();
        System.out.println(space);
    }
}
