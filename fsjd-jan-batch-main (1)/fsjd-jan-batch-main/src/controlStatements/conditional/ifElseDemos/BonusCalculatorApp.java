package controlStatements.conditional.ifElseDemos;

import java.util.Scanner;

public class BonusCalculatorApp {
    public static void main(String[] args) {
        /*
         * A company decided to give bonus of 50% to employee if his/her year of service is more than 5 years.
         * Ask user for their salary and year of service and print the net bonus amount.
         *
         * */

        System.out.println("Enter the years of service and salary");
        Scanner scanner = new Scanner(System.in);
        int yearsOfService = scanner.nextInt();
        float salary = scanner.nextFloat();
        float bonusAmountPercentage = 0.0F;
        if (yearsOfService > 5) {
            bonusAmountPercentage = 0.5F;
        }
        float bonusAmountPayable = salary * bonusAmountPercentage;
        System.out.println("Years of Service\t " + yearsOfService);
        System.out.println("Salary \t" + salary);
        System.out.println("Bonus Payable \t" + bonusAmountPayable);

    }
}
