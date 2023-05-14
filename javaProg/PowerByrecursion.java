public class PowerByrecursion {
    public static double getPower(int x,int n){
        if(n==0){
            return 1;
        }
        double ans = x*getPower(x, Math.abs(n)-1);
        if(n<0){
            return 1/ans;
        }
        else{
            return ans;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = -4;
        System.out.println(getPower(x,n));
    }
}
