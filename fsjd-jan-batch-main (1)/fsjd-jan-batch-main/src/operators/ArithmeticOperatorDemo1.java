package operators;

public class ArithmeticOperatorDemo1 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;

        System.out.println(number1 + number2);// 300
        System.out.println(number1 - number2);// -100
        System.out.println(number1 * number2);// 20000

        // operation : division
        // division : quotient, remainder
        // 50/2 =>  quotient=25, Remainder=0

        // Quotient /
        // Remainder %
        System.out.println(number1 / number2);// 100/200 --> Q=0,
        System.out.println(number1 % number2);// 100%200 --> R = 100
    }
}