package operators;

public class UnaryOperators1 {
    public static void main(String[] args) {
      int number = 100;
    
      System.out.println(number++);//100
      System.out.println(number);//101

      //number = number + 100;
      number += 100;
      System.out.println(number);

    //   number = number * 10;
            number *=10;
      System.out.println(number);
    
    }

}