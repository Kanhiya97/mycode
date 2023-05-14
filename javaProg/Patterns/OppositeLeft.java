public class OppositeLeft {
    public static void main(String[] args){
        int n = 5;
        int nst = n;

        for(int i=n;i>=1;i--){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            nst--;
        }
    }
}
