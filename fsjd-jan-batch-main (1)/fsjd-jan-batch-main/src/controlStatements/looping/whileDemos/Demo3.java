package controlStatements.looping.whileDemos;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Enter the any character");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        //X
        while (ch !='x'){
            System.out.println(ch);
            System.out.println("Enter the character");
            ch = scanner.next().charAt(0);
        }
    }
}
