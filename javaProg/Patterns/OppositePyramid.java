public class OppositePyramid {
    public static void main(String[] args){
        int n = 4;
        int nst=2*n-1, nsp=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();

            nsp++;
            nst-=2;
        }
    }
}
