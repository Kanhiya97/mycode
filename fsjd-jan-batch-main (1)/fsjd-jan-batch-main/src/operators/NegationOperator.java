package operators;

public class NegationOperator {
    public static void main(String[] args) {
    
      System.out.println(~4); // -5
      // 0000 1 0 0 --> 1's complement -->  1111 011
      // 2's complement --> plus one               1
      //                                     1 1111 100 ---> -5
      System.out.println("Binary value "+Integer.toBinaryString(-5));
    //   00000000 00000000 00000000 00000100
//       11111111 11111111 11111111 11111011
            
      // 11111111 11111111 11111111 11111011
    
    }

}