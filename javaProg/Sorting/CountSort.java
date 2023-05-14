import java.lang.reflect.Array;

public class CountSort{
    public static void count(int[] arr){
        
        // Finding maximum and minimum in array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        // Creating frequency array
        int size = max-min+1;
        int freq[] = new int[size];
        for(int i=0;i<arr.length;i++){
            int val = arr[i];
            int idx = val-min;
            freq[idx]++;
        }

        // Prefix Sum Array
        for(int i=1;i<size;i++){
            freq[i] += freq[i-1];
        }

        // Decreasing 1 from every element for indexes
        for(int i=0;i<size;i++){
            freq[i]--;
        }


        int ans[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val = arr[i];
            int idx = freq[val-min];
            ans[idx] = val;
            freq[val-min]--;
        }

        for(int i=0;i<ans.length;i++){
            arr[i] = ans[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,2,3,1,5,9,3,5,1,3};
        count(arr);
        for(int x:arr){
            System.out.print(x +" ");
        }
    }
}
