package operators;

public class IncrementDecrementOperator5{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a++ + ++b + --c + d-- - --a - ++b + ++c + d++);//11
        //1 + 3 + 2 + 4  - 1 - 4 + 3 + 3 = 11

        System.out.println(a);//1
        System.out.println(b);//4
        System.out.println(c);//3
        System.out.println(d);//4

    }
}