package controlStatements.looping.forDemos;

public class PerfectNumber {
    public static void main(String[] args) {
        //Perfect number : is the number whose factors sum is equal to given number
        //6 = 1+2+3
        //28 = 1, 2, 4, 7, 14 = 28
        //factors sum = given number ---> perfect number
        int number = 6;
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                sumOfFactors = sumOfFactors + i;
            }
        }
        System.out.println("Sum of factors = "+sumOfFactors+"\t Number ="+number);
        System.out.println(number==sumOfFactors ? "Its perfect ":"Not a perfect");
    }
}
