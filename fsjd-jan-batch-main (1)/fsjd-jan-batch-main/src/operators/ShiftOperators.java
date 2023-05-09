package operators;

public class ShiftOperators {
    public static void main(String[] args) {
      // << , >>, >>>[unsigned right shift operator]

      // shift the bits of 4 to the left by 2 place
      System.out.println(4 << 2);//16 --> 4 * 2^2
      System.out.println(4 << 3);//32 --> 4 * 2^3
      //1 byte = 8 bits
      // 4 -->          0 0 1 0 0 0 0 ---> 16

      // shift the bits of 4 to the right by 1 place
      // 4 -->          0 0 0 0 0 1 0 ---> 2
      System.out.println(4 >> 1);//2 ---> 4/2^1 ==

      System.out.println(64 << 2);// 256
      // 64 -->    1 0 0 0 0 0 0 0 0 ---> 256

      System.out.println(64 >> 2);// 16 ==> 64/2^2=>16
      // 64 -->   0 0 1 0 0 0 0  ---> 16
    }

}