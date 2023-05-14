import java.util.ArrayList;
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int s  = 12;
        ArrayList<Integer> al = findSubarray(arr,s);
        System.out.println(al);
    }
    public static ArrayList<Integer> findSubarray(int[] arr, int s){
        ArrayList<Integer>al = new ArrayList<>();
        al.add(-1);
        int sum=0,fi=0,li=0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum>s){
                sum -= arr[fi];
                fi++;
            }else if(sum==s){
                li = i;
                al.remove(0);
                al.add(fi+1);
                al.add(li+1);
                break;
            }
        }

        return al;
    }
}
