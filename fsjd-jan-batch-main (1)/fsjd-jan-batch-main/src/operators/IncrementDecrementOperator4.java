package operators;

public class IncrementDecrementOperator4{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a++ + ++b + --c + d--);
        //1 + 3 + 2 + 4 = 10

        System.out.println(a);//2
        System.out.println(b);//3
        System.out.println(c);//2
        System.out.println(d);//3

        

    }
}