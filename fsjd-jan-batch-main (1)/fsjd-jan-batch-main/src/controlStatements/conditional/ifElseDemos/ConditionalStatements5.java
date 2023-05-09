package controlStatements.conditional.ifElseDemos;

public class ConditionalStatements5 {
    public static void main(String[] args) {
        // if else are keywords
        // if can come interdependently but not else
        //for every else there should match if
        // if condition is true then only if-block will be executed
        // else block will be executed when the condition is false
        // either if block or else block will execute not both
        // there should not any statement in between if and else

        if (true) {
            System.out.println("good morning if");
        } 
        //System.out.println("independent statement");
        else {
            System.out.println("good evening else");
        } 

    }
}