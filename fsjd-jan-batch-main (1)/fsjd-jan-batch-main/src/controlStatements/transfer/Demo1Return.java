package controlStatements.transfer;

public class Demo1Return {
    public static void main(String[] args) {
        // return : control is jumped from current method to the caller
        for (int i = 1; i <=10 ; i++) {
            if(i==5){
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main");
    }
}
