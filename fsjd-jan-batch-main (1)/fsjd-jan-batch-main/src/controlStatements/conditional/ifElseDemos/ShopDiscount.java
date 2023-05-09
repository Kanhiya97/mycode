package controlStatements.conditional.ifElseDemos;

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        /*
         * A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
         * Ask user for quantity
         * Suppose, one unit will cost 100.
         * Judge and print total cost for user.
         *
         * */

        System.out.println("Enter the quantity and per unit cost");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        float perUnitCost = scanner.nextFloat();

        float billAmount = quantity * perUnitCost;
        float discount = 0.0F;
        if (billAmount >= 1000) {
            discount = 0.1F;
        }
        float payableAmount = billAmount - billAmount * discount;
        System.out.println("****************************");
        System.out.println("Quantity ----> " + quantity);
        System.out.println("Cost Per Unit ----> " + perUnitCost);
        System.out.println("Total Bill amount before discount ----> " + billAmount);
        System.out.println(" Discount discount ----> " + billAmount * discount);
        System.out.println(" Payable amount ----> " + payableAmount);
    }
}
