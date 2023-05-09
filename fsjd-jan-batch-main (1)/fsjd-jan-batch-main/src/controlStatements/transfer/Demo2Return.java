package controlStatements.transfer;

public class Demo2Return {
    public static void main(String[] args) {
        m1();
        System.out.println("rest of the main method");
    }

    private static void m1() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of the m1 method");
    }
}
