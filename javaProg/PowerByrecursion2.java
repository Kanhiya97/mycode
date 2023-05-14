public class PowerByrecursion2 {
    public static double getPower(double x, int n) {
        if (n == 0) {
            return 1;
        }

        // if n is even
        if (n % 2 == 0) {
            if (n < 0) {
                return 1 / (getPower(x, Math.abs(n) / 2) * getPower(x, Math.abs(n) / 2));
            } else {
                return getPower(x, n / 2) * getPower(x, n / 2);
            }
        } else {
            if (n < 0) {
                return 1 / (getPower(x, Math.abs(n) / 2) * getPower(x, Math.abs(n) / 2) * x);
            } else {
                return getPower(x, n / 2) * getPower(x, n / 2) * x;
            }
        }
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 4;
        System.out.println(getPower(x, n));
    }
}
