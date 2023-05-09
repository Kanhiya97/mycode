package operators;

public class ArithmeticOperatorDemo3 {
    public static void main(String[] args) {
        System.out.println('A' / 10);// Q=6 
        System.out.println(10 / 'A');// Q=0

        System.out.println(1 % 'A');// R=1 
        System.out.println('A' % 1);// R=0

        System.out.println('A' + 25);// 90 
        System.out.println('A' - 5);// 60

        System.out.println('B' % 'A');// R=1
        System.out.println('C' % 'A');// R=2

    }
}