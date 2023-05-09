package classComponents;

public class Student {
    int rollNumber;// instance variable
    String name;//instance variable
    static String collegeName;//static variable

    //zero param
    public Student() {
    }
    //param con
    public Student(int rollNumber, String name) {//local
        this.rollNumber = rollNumber;
        this.name = name;
    }
    {}//instance block
    static {}//static block
    void m1(){}//instance method
    static void m2(){}//static method

    static class A {}//static nested class
    class B {}//inner class

    //main method
    public static void main(String[] args) {
        //local inner class
        class C{}
    }
}
