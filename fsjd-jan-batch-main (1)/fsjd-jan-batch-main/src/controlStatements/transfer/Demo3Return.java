package controlStatements.transfer;

public class Demo3Return {
    public static void main(String[] args) {
        System.out.println("Quotient " + divide(10, 2));
    }

    private static int divide(int number1, int number2) {
        if (number2 == 0) {
            return -1;
        }
        System.out.println("divide method");
        return number1 / number2;
    }
}
