package controlStatements.looping.forDemos.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        /*
        *
        *   1010101
             10101
              101
                1
        *
        * */
        for (int row = 1; row <= 4; row++) {
            //spaces
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            //number
            for (int number = 7; number >= row * 2 - 1; number--) {
                if (number % 2 == 1) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }

            System.out.println();
        }
    }
}
