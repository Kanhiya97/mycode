package controlStatements.looping.forDemos.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        /*
         *  1 *
         *  2 ** *
         *  3 *** **
         *  4 **** ***
         *  5 ***** ****
         *  6 ****** *****
         *
         * */
        for (int row = 1, i = 0; row <= 50; row++, i++) {
            for (int column = 1; column <= row + i; column++) {
                System.out.print(column+"*");
            }
            System.out.println();
        }

    }
}
