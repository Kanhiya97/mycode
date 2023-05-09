package controlStatements.looping.forDemos.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        /*
         *              *
         *             **
         *            ***
         *           ****
         *          *****
         *
         * */
        for (int row = 1; row <= 5; row++) {

            //spaces : no. of spaces = 5 - 1
            for (int space = 4; space >= row; space--) {
                System.out.print(" ");
            }
            //stars: no.of stars = rowNumber
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
