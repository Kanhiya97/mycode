package controlStatements.transfer;

public class Demo2Break {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("rest of  the main");

    }
}
