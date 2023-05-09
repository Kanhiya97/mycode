package controlStatements.looping.whileDemos;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        // sum of digits of cube ==> 1 + 2^3 + 3^3---> 1 + 8+ 27--> 36
        System.out.println("Enter the number");//123=6
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;

        // 123 = 123%10=3
        //123/10 = 12 --- > 12%10 = 2
        //12/10= 1 ---> 1%10= 1
        //1/10 = 0

        while (number > 0) {
            int lastDigit = number % 10;//123%10=3 --> 12%10--> 2 ---> 1%10--> 1
            sum = sum + lastDigit * lastDigit * lastDigit;
            number = number / 10; // 123/10 => 12 --> 12/10 ---> 1/10-->0
        }

        System.out.println("Sum of digits of cube " + sum);

        System.out.println(originalNumber == sum ? "Armstrong" : "Not a armstrong number");
    }
}
