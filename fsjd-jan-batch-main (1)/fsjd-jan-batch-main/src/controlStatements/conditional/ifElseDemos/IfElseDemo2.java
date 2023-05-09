package controlStatements.conditional.ifElseDemos;

import java.util.Scanner;

public class IfElseDemo2 {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        
        
        if( age >= 18){
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }
        

    }
}