package operators;

public class IncrementDecrementOperator3{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = --a;//a=0, c=0
        int d = b--; //d=2, b=1

        System.out.println(a);//0
        System.out.println(b);//1
        System.out.println(c);//0
        System.out.println(d);//2

    }
}