package controlStatements.looping.forDemos;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // 40 : 1,2, 4, 5, 8, 10, 20
        // 100 : 1,2,4,5, 10, 20, 25, 50
        //1000: 1,2,4,5,10, 20, 25, 50, 100, 200, 250, 500
        //10000: 1,2, 4,5... 5000,
        int number = 24;//1,2,3,4,6,8,12
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }
}
