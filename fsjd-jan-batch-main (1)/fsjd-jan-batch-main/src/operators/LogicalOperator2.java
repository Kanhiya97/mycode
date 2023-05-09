package operators;

public class LogicalOperator2 {
    public static void main(String[] args) {
        // AND: both should be true then only it is true otherwise it is false
        System.out.println("AND operation");
        System.out.println((4 > 3) && (4 > 2));// true
        System.out.println((4 > 3) && (4 < 2));// false
        System.out.println((4 < 3) && (4 > 2));// false
        System.out.println((4 < 3) && (4 < 2));// false

        // OR: one of them should be true then it is true otherwise it is false
        System.out.println("OR operation");
        System.out.println((4 > 3) || (4 > 2));// true
        System.out.println((4 > 3) || (4 < 2));// true
        System.out.println((4 < 3) || (4 > 2));// true
        System.out.println((4 < 3) || (4 < 2));// false

        // XOR: both the operands must be unique then it is true otherwise it is false
        System.out.println("XOR operation");
        System.out.println((4 > 3) ^ (4 > 2));// false
        System.out.println((4 > 3) ^ (4 < 2));// true
        System.out.println((4 < 3) ^ (4 > 2));// true
        System.out.println((4 < 3) ^ (4 < 2));// false
    }
}