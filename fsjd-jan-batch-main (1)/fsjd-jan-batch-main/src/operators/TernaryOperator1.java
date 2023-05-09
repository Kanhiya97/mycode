package operators;

public class TernaryOperator1 {
    public static void main(String[] args) {
        //unary operators: it wokrs only operand. ++, --, !, ~
        //binary operators: it works on two operands. +,-, *, / %, &&, &, ||, |, ^, <<, >>,
        //ternary operators: this operator will work on three operands
        // there is only one ternay operator operator available in java
        // it is also called as conditional operator

        // (operand1) ? (operand2) : (operand3)
        // operand1 should be of type boolean
        // operand1 if it is boolean true then output will be operand2
        // operand1 if it is boolean false then output will be operand3
        //operand 1: variable but of type of boolean
                    // expression but result should of type boolean
                    // function call but return type should be boolean
        System.out.println( (true) ?("its true") :("its false") );//its true
        System.out.println( (false) ?("its true") :("its false") );//its false

        int number1 = 10;
        int number2 = 20;
        System.out.println( (number1 > number2) ? number1 : number2);

    }
    
}