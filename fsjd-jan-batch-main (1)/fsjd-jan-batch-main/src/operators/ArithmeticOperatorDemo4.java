package operators;

public class ArithmeticOperatorDemo4 {
    public static void main(String[] args) {
        System.out.println(10 + 20);// 30
        System.out.println('A' + 'A');// 130
        System.out.println('A' + 5);// 70
        System.out.println('A' - 'X');// -23
        System.out.println('A' - 5.0F);// 60.0
        // System.out.println(true % false);
        // System.out.println('A' / 0);//CTE
        System.out.println(10.0F % 0);

        System.out.println(10 + 5 / 3 + 6 + 9); // = 10 + 1 + 6 + 9 = 26
        System.out.println(10 + 5 * (4 - 3) + 2 / 3); //10 + 5 + 0 = 15

    }
}