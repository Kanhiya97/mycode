package operators;

import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        //accept the input from user. keyboard
        System.out.println("Enter three numbers ");
        
        Scanner scanner = new Scanner(System.in);
    

        // minimum of three numbers using ternary operator
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int minimum = (number1 <= number2 && number1 <= number3)
                ? number1
                : ((number2 <= number1 && number2 <= number3)
                        ? number2
                        : number3);

        System.out.println("Minimum number is " + minimum);

    }

}