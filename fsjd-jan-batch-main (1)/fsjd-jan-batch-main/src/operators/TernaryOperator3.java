package operators;

public class TernaryOperator3 {
    public static void main(String[] args) {
        // minimum of three numbers using ternary operator
        int number1 = 2;
        int number2 = 2;
        int number3 = -1;

        int minimum = (number1 <= number2 && number1 <= number3)
                ? number1
                : ((number2 <= number1 && number2 <= number3)
                        ? number2
                        : number3);

        System.out.println("Minimum number is " + minimum);

    }

}