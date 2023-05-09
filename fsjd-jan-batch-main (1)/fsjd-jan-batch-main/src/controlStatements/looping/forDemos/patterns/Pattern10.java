package controlStatements.looping.forDemos.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        /*
         *  11111
         *  2222
         *  333
         *  44
         *  5
         *
         *
         * */
        for (int row = 1; row <= 5; row++) {
            for (int column = 5; column >= row; column--) {
                System.out.print(row);
            }
            System.out.println();
        }

    }
}
