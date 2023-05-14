import java.util.ArrayList;
public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(12);
        al.add(1);
        al.add(87);

        for(Integer x:al){
            System.out.println(x);
        }
    }
}
