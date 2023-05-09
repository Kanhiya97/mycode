package classComponents;

public class Demo {
    int c = 100;// heap
    int a;// heap
    int b;// heap
    static int staticVariable = 200;//class or method area

    public static void main(String[] args) {
        int localVariable=300;//stack memory
        //local variable we access directly we don't need any prefix or suffix.
        System.out.println(localVariable);


        // To access instance variables we need a reference variable which points to an object
        // instance variables will be part of an object
        Demo ref = new Demo();
        // object: new Demo()
        //ref : reference variable
        // reference variable points to an object
        // ref ----> { c = 100, a=0, b=0 }
        System.out.println(ref.c);//100
        System.out.println(ref.a);//0
        System.out.println(ref.b);//0


        // static  variables will be accessed with the help of className as they belong to class
        // static variables will be common for the all the objects of that class
        System.out.println(staticVariable);
        System.out.println(Demo.staticVariable);

        System.out.println(Constant.username);
        System.out.println(Constant.password);
        m1();
    }
    static void m1(){
        m2();
    }
    static void m2(){}
}
