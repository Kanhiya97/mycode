package controlStatements.looping.forDemos;

public class PrimeFactor {
    public static void main(String[] args) {
        int number = 50;
        for (int i = 1; i <=number/2 ; i++) {
            if(number % i==0){
                //its factor now check if it is prime
                boolean isPrime = true;

                for (int j = 2; j <=i/2 ; j++) {
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println("Prime factor "+ i);
                }
            }
        }
    }
}
