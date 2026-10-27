package coreJava.test;

public class Test2 {

    public static void pattern1(){
        System.out.println("print absurd");
        int m =4;
        for(int i =1;i<=m;i++) {
            for(int j=1;j<=m+3;j++){
                if(i<=j && j-i<=m-1 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }



    public static void pattern2(){


            int m = 4;

            for (int i = 1; i <= 2 * m - 1; i++) {

                for (int j = 1; j <= 2 * m - 1; j++) {

                    int num;

                    if (i <= m) {
                        num = i;
                    } else {
                        num = 2 * m - i;
                    }

                    if (j >= m - num + 1 && j <= m + num - 1) {
                        System.out.print(num + " ");
                    } else {
                        System.out.print("  ");
                    }
                }

                System.out.println();
            }

    }


    public static void pattern3() {

        int m = 4;

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= 2 * m - 1; j++) {

                if (j >= m - i + 1 && j <= m + i - 1) {

                    if ((j - (m - i + 1)) % 2 == 0) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("* ");
                    }

                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern2();
        System.out.println();
        pattern3();
    }
}
