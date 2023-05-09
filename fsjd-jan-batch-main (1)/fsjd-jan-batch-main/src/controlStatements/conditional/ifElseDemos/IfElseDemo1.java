package controlStatements.conditional.ifElseDemos;

import java.util.Scanner;

public class IfElseDemo1 {
    public static void main(String[] args) {
        System.out.println("Enter two values ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        if(number1 > number2){
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
        

    }
}