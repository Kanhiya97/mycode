public class OppositeRight {
    public static void main(String[] args){
        int n = 5;
        int nst=n, nsp=0;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst--;
        }
    }
}
