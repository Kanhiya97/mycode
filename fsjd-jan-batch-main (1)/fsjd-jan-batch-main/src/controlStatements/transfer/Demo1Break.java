package controlStatements.transfer;

public class Demo1Break {
    public static void main(String[] args) {
        switch (2) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }
        //break;
        System.out.println("statements");

    }
}
