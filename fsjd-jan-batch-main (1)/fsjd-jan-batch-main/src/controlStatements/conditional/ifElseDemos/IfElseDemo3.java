package controlStatements.conditional.ifElseDemos;

import java.util.Scanner;

public class IfElseDemo3 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
      
        if( number%2==0){
            System.out.println("Entered number is even: "+number);
        } else {
            System.out.println("Entered number is Odd: "+number);
        }
        

    }
}