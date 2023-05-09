package controlStatements.looping.forDemos.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        /*
         *  12345
         *  12345
         *  12345
         *  12345
         *
         * */
        for (int row = 1; row <= 50; row++) {
            for (int column = 1; column <= 50; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
