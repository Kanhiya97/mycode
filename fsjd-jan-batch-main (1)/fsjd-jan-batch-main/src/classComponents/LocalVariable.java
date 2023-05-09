package classComponents;

public class LocalVariable {

    // JVM calls main method first
    public static void main(String[] arrayOfString) {
        int variable = 100;
        System.out.println(variable);
        System.out.println(arrayOfString.toString());
        m1();
        System.out.println("rest of the main method");
    }

    public static void m1(){
        int a =100;
        System.out.println(a);
        //System.out.println(variable);
        //System.out.println(arrayOfString);
    }

}
