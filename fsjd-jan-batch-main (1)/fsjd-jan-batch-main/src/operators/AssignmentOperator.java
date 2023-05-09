package operators;

public class AssignmentOperator{
    public static void main(String[] args) {
        int number  = 30; // = assignment
        //LHS = RHS
        //LHS = variable
        //RHS = variable, value, expresion, function call
        int number2 = getValue();
        System.out.println(number2);
        System.out.println(number = 100);

        int age = 20+30/2;
        System.out.println(age);//35
    }
    static int getValue(){
        return 10;
    }
}