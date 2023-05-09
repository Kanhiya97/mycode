package controlStatements.looping.forDemos;

public class PrimeNumber {
    public static void main(String[] args) {
        //prime number : which is divisible only 1 and number itself
        // every number is divisible by 1 and number itself.
        // Prime number is a number which is not divisible by any other number except 1 and number itself
        // 40 : 2, 4, 5, 8, 10, 20
        // 100 : 2,4,5, 10, 20, 25, 50
        //1000: 2,4,5,10, 20, 25, 50, 100, 200, 250, 500
        //10000: 2, 4,5... 5000,
        int number = 100;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            //90%2==0
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Its prime number" : "not a prime");
    }
}
