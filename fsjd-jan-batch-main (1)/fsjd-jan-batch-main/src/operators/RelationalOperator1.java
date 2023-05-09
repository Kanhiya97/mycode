package operators;

public class RelationalOperator1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // these operators are used to compare the two operands
        // >, <, >=, <=, ==, !=
        // output of these operators will be boolean
        System.out.println(a > b);// false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        
        System.out.println("For boolean type");
        // for boolean data type onle == and != are applicable
        System.out.println(true == true);//true
        System.out.println(true != true);//false
        System.out.println(true == false);//false
        System.out.println(false != false);//false
        System.out.println(false == false);//true
        System.out.println(true != false);//true


        //System.out.println(true > false);//CTE
        //System.out.println(true < false);//CTE
        //System.out.println(true >= false);//CTE
        //System.out.println(true <= false);//CTE

        System.out.println(10%2==0);//true
        System.out.println(10%3==0);//false
        System.out.println(1%10==0);//false
    }
}