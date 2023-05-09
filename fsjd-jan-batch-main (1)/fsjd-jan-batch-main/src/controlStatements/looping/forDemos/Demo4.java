package controlStatements.looping.forDemos;

public class Demo4 {
    public static void main(String[] args) {

        //infinite loop : 0
        for (System.out.println("initialization"); true; System.out.println("increment/decrement")) {
            System.out.println("*");
        }
    }
}
