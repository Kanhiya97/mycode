import java.util.ArrayList;
public class SubsetsOfN {
    public static void findSubsets(int n, ArrayList<Integer>al){
        if(n==0){
            for(Integer x:al){
                System.out.print(x +" ");
            }
            System.out.println();
            return;
        }

        // will be add
        al.add(n);
        findSubsets(n-1,al);

        // will not be add
        al.remove(al.size()-1);
        findSubsets(n-1,al);

    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer>al = new ArrayList<>();
        findSubsets(n,al);
    }
}
