package operators;

public class TernaryOperator2 {
    public static void main(String[] args) {

        // maimum of three numbers using ternary operator
        int number1 = 1;
        int number2 = 1;
        int number3 = -20;

        int maximum = (number1 >= number2 && number1 >= number3)
                ? number1
                : ((number2 >= number1 && number2 >= number3)
                        ? number2
                        : number3);

        System.out.println("Maximum number is " + maximum);

    }

}