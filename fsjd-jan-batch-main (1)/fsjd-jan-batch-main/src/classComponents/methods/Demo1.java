package classComponents.methods;

public class Demo1 {
    static  int a = 100;
    int b = 200;
    public static void main(String[] args) {
        //static variables
        System.out.println(Demo1.a);

        //instance variables
        Demo1 demo = new Demo1();
        System.out.println(demo.b);

        int c = 300;//local
        System.out.println("Local "+c);
    }
}
