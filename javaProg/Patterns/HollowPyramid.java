public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1, nsp = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                if (j == 1 || j == nst || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }
}
