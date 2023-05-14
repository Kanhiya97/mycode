// Password should have at least one numerical digit(0-9).
// Password's length should be in between 8 to 15 characters.
// Password should have at least one lowercase letter(a-z).
// Password should have at least one uppercase letter(A-Z).
// Password should have at least one special character ( @, #, %, &, !, $, *).

public class PasswordChecker {
    public static void main(String[] args) {
        String str = "Mohan1234";
        System.out.println(checker(str));
    }

    public static boolean checker(String A) {
        if (A.length() < 8 || A.length() > 15) {
            return false;
        }
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if ((int) (ch - '0') >= 0 && (int) (ch - '0') <= 9) {
                c1++;
            } else if (ch >= 'a' && ch <= 'z') {
                c2++;
            } else if (ch >= 'A' && ch <= 'Z') {
                c3++;
            } else if (ch == '@' || ch == '#' || ch == '%' || ch == '&' || ch == '!' || ch == '$' || ch == '*') {
                c4++;
            }
        }

        if (c1 > 0 && c2 > 0 && c3 > 0 && c4 > 0) {
            return true;
        } else {
            return false;
        }
    }
}
