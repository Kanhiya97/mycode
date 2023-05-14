import java.util.ArrayList;

public class StringToArray {
    public static void main(String[] args) {
        String str = " my0 Moh3an is2 1name  ";
        ArrayList<String> al = new ArrayList<>();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                s += ch;
            } else {
                if (!s.equals("")) {
                    al.add(s);
                }
                s = "";
            }

        }

        System.out.println(al.size());
        for (String x : al) {
            System.out.println(x);
        }
    }
}
