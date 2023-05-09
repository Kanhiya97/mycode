package controlStatements.looping.whileDemos;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        // sum of digits
        System.out.println("Enter the number");//123=6
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        // 123 = 123%10=3
        //123/10 = 12 --- > 12%10 = 2
        //12/10= 1 ---> 1%10= 1
        //1/10 = 0

        while(number > 0){
            int lastDigit = number % 10;//123%10=3 --> 12%10--> 2 ---> 1%10--> 1
            sum = sum + lastDigit;
            number= number/10; // 123/10 => 12 --> 12/10 ---> 1/10-->0
        }

        System.out.println("Sum of digits "+ sum);
    }
}
