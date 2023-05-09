package controlStatements.looping.forDemos;

public class PrimeRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {

            // check every number is prime or not
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
