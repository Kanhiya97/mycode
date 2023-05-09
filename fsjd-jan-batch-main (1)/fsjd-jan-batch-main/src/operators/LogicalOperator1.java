package operators;

public class LogicalOperator1 {
    public static void main(String[] args) {
        // &&, &, ||, |, !, ^ 
        //AND, OR, NOT, XOR --> these keywords are not there in java
        // AND: Laptop : 16 GB && I7 processor && SSD 512 GB && generation : 12th
        // OR: Laptop : 16 GB || I7 processor || SSD 512 GB || generation : 12th
        // XOR: TRUE ^ FALSE = TRUE
        
        //AND: both should be true then only it is true otherwise it is false
        System.out.println("AND operation");
        System.out.println( true && true );//true
        System.out.println( true && false );//false
        System.out.println( false && true );//false
        System.out.println( false && false );//false

        //OR: one of them should be true then it is true otherwise it is false
        System.out.println("OR operation");
        System.out.println( true || true );//true
        System.out.println( true || false );//true
        System.out.println( false || true );//true
        System.out.println( false || false );//false

        //XOR: both the operands must be unique then it is true otherwise it is false
        System.out.println("XOR operation");
        System.out.println( true ^ true );//false
        System.out.println( true ^ false );//true
        System.out.println( false ^ true );//true
        System.out.println( false ^ false );//false
    }
}