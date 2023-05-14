import java.util.ArrayList;
import java.util.HashMap;

public class FindNumsOccurOddTimes {
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,4,4,5,7,8,5,1,1,1,1,10};
        ArrayList<Integer>al = oddOccurance(arr);

        for(Integer x:al){
            System.out.print(x +" ");
        }
    }
    public static ArrayList<Integer> oddOccurance(int[] arr){
        ArrayList<Integer>al = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Integer k:map.keySet()){
            if(map.get(k)%2 != 0){
                al.add(k);
            }
        }

        return al;
    }
}
