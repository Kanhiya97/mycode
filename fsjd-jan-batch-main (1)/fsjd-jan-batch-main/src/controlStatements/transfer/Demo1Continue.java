package controlStatements.transfer;

public class Demo1Continue {
    public static void main(String[] args) {
        //continue: it skips the current iteration and continue from next iteration
        // control is jumped from current iteration to next iteration
        for (int i = 1; i <=10 ; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("rest of  the main");

    }
}
