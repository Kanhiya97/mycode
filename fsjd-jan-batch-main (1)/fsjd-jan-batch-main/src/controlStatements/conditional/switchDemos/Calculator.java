package controlStatements.conditional.switchDemos;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Enter the operation such +, -, *, /, %");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Addition " + (number1 + number2));
                break;
            case '-':
                System.out.println("Subtraction " + (number1 - number2));
                break;
            case '*':
                System.out.println("Multiplication " + (number1 * number2));
                break;
            case '/':
                System.out.println("Division and Quotient is " + (number1 / number2));
                break;
            case '%':
                System.out.println("Division and Remainder is  " + (number1 % number2));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}
