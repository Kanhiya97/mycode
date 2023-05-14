public class A {
    public static void main(String[] args) {
        int n = 6;
        int nst=1, nsp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "); 
            }
            for(int j=1;j<=nst;j++){
                if(j==1 || j==nst){
                System.out.print("*");
                }else if(i==n/2+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            nst+=2;
            nsp--;
        }
    }
}
