package controlStatements.looping.forDemos.patterns;

public class Pattern4Tables {
    public static void main(String[] args) {
        /*
         *  1 2 3 4 5 6 7 8 ...30...500
         *  2 4 6 8 10
         *  3 6 9 12 15
         *  4 8
         *  5 10
         *  6 12
         *  7 14
         *  8 16
         *  9 18
         *  10 20 30 40 50
         *
         *
         *
         * */
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 30; column++) {
                System.out.print(column * row + "\t");
            }
            System.out.println();
        }

    }
}
