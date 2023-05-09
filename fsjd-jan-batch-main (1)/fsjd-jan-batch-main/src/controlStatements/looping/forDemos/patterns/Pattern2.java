package controlStatements.looping.forDemos.patterns;

public class Pattern2 {
    public static void main(String[] args) {
        /*
         *  111111
         *  222222
         *  333333
         *  444444
         *
         * */
        for (int row = 1; row <= 50; row++) {
            for (int column = 1; column <= 50; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
