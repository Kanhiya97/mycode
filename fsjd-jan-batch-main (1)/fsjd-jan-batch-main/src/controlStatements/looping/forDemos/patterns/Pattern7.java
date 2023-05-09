package controlStatements.looping.forDemos.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        /*
         *  1
         *  2 2
         *  3 3 3
         *  4 4 4 4
         *  5 5 5 5 5
         *
         * */
        for (int row = 1; row <= 50; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }

    }
}
