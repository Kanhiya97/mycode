package operators;

public class IncrementDecrementOperator1 {

    public static void main(String[] args) {
        // ++, -- will be applied on a single variable
        // ++ : increment the value of a variable by 1
            // Pre-Increment : ++a : value will be incremented by 1 and then it will be used[Print, arithmetic operation +,-,]
            // Post- Increment : a++ : it will be used first [Print, arithmetic operation +,-,] then value will be incremented by 1
            int a = 1 ;
            System.out.println(++a);//2

        // -- : decrement the value of a variable by 1
            // Pre-Decrement : --b: value will be decremented by 1 and then it will be used[Print, arithmetic operation +,-,]
            // Post-Decrement : b--: it will be used first [Print, arithmetic operation +,-,] then value will be decremented by 1
            int b = 2;
            System.out.println(--b);//1
    }

}