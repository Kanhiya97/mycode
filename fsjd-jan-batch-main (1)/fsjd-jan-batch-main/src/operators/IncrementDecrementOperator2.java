package operators;

public class IncrementDecrementOperator2{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a;//c= 2
        int d = b++; // d= 2

        System.out.println(a);//2
        System.out.println(b);//3
        System.out.println(c);//2
        System.out.println(d);//2

    }
}