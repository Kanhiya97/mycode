public class Recursion4 {
    public static int findFactorial(int n){
        if(n==1){
            return 1;
        }

        int ans;
        ans = n*findFactorial(n-1);

        return ans;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(findFactorial(n));
    }
}
