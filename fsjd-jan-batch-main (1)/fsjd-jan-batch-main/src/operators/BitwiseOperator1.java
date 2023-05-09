package operators;

public class BitwiseOperator1 {
    public static void main(String[] args) {
        //bitwise operators: &, |, ^, ~, <<, >>, >>> 
        System.out.println(4 & 5);//4
        //4 ---> 100
        //5 ----> 101
        //4 <---- 100

        System.out.println(4 | 5);//5
        //4 ---> 100
        //5 ----> 101
        //5 <---- 101

        System.out.println(4 ^ 5);//1
        //4 --->    100
        //5 ---->   101
        //1 <----   001

        //negation
        System.out.println("Negation operation");
        System.out.println(~4);// = add one and change the sign//-5
        System.out.println(~5);//-6
        System.out.println(~-5);//4
        System.out.println(~10);//-11

        // << : left shift operator 
        System.out.println("shift the bits of a given number by n bits to the left");
        System.out.println(4 << 1);//8 shift the bits of 4 to the left by  1 place
        // <-- 0 00001000
        System.out.println(4 << 2);//16
        // <-- 0 0010000
        System.out.println(4 << 3);//32
        System.out.println(4 << 4);//64 ==  output = number * 2 ^ power
        System.out.println(5 << 2 );//output = number * 2 ^ power= 5 * 2^2= 20

        // >> right shift operator : shift the bits of a given number by given places to the right
        System.out.println(4 >> 1);//2
        // 0 000 0100 --> 000 0010 --> 2
        System.out.println(5 >> 2);//1
        // 0 000 0101 --> 000 001 --> 1
    }
}