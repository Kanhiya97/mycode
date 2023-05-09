package controlStatements.looping.forDemos.patterns;

public class Pattern14 {
    public static void main(String[] args) {
        /*
        *   *
        *   **
        *   ***
        *   ****
        *   *****
        *   ****
        *    ***
        *    **
        *       *
        * */
        for (int row = 1; row <=5 ; row++) {
            //spaces
            for (int space = 5; space >row ; space--) {
                System.out.print(" ");
            }
            //stars
            for (int star = 1; star <=row ; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int row = 1; row <=4 ; row++) {
            //spaces
            for (int space = 1; space <=row ; space++) {
                System.out.print(" ");
            }
            //stars
            for (int star = 4; star>=row ; star--) {
                System.out.print(" * ");
            }
            System.out.println();
        }




    }
}
