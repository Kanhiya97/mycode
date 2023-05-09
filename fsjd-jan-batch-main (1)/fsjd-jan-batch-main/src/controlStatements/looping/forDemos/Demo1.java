package controlStatements.looping.forDemos;

public class Demo1 {
    public static void main(String[] args) {
        //looping, repeat, iterative,
        // for, while, do-while

        // for : when no. of iterations are known in advance then use for loop
        // while : when no. of iterations are not known in advance then use while loop
        // do-while : when no. of iterations are not known in advance,
                    //   and we want to execute the code at-least once  then use while loop

        // initialization; condition ; increment/decrement all are optional
        // for condition default value is true
            // condition can be
                    // boolean direct value,
                    // expression of type boolean,
                    // function call that returns boolean value
        // initialization: means assigning some value for variable
        // increment/decrement :

        // initialization part will be executed only once.
        // after initialization control goes to condition
        // if the condition is true then control will go inside the body{}
        //after that control goes to increment/decrement
        // after increment/decrement control goes to condition
        // condition [true] ---> body ---> increment/decrement --> condition [true] --> body
        // condition[false]--> out of for
        for( int i = 0; i<=5 ; i++ ){
            System.out.println("*");
        }

    }
}
