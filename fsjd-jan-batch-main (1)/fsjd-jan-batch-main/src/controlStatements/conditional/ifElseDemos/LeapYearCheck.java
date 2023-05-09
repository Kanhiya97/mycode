package controlStatements.conditional.ifElseDemos;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        /*
         * Leap year:
         *  it is  year which is divisible by 4
         * and if it is century then it should be divisible by 400
         * */
        System.out.println("Enter the year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        //2020

        // if it is a century then it should be divisible by 400 then it is leap.
        // it is not a century then it should be divisible by 4 then it is leap.
        //1900
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("Its leap year " + year);
        } else {
            System.out.println("Its not a leap year " + year);
        }


    }
}
