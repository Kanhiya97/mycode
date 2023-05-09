package controlStatements.looping.forDemos.patterns;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //5! = 1*2*3*4*5= 120
        //6! = 1 * 2 * 3 * 4 * 5 * 6 = 720
        int factorial = 1;
        for (int i = 1; i <=number ; i++) {
             factorial = factorial * i;// 1 * 1 -> 1 * 2 --> 2 * 3 --6 * 4 --> 24 * 5 --> 120
        }
        System.out.println("Enter numbered "+number+"\t Factorial "+factorial);
    }
}
