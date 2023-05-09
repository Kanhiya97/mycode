package operators;

public class StringConcatenationDemo1 {
    public static void main(String[] args) {
        System.out.println("hello " + " world");// hello world
        System.out.println("hello " + "20");// hello 20
        System.out.println("10" + "20");// 1020
        System.out.println(10 + "20");// 1020
        System.out.println(10 + 20);// 30
        System.out.println("A" + 'A');// AA
        System.out.println('A' + 'A' + "A");// 130A
        System.out.println(10 + 20 + "20" + 30 + 40 + 40);//3020304040
        System.out.println('a'+5);

    }
}