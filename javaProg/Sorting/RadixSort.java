public class RadixSort{
    public static void main(String[] args){
        int[] arr = {987,234,1,2,567,34,2,99};
        radix(arr);

        for(int x:arr){
            System.out.print(x +" ");
        }
    }
    public static void radix(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        int exp = 1;
        while(exp<=max){
            countSort(arr,exp);
            exp = exp*10;
        }
    }
    public static void countSort(int[] arr,int exp){
        int freq[] = new int[10];
        for(int i=0;i<arr.length;i++){
            int idx = (arr[i]/exp)%10;
            freq[idx]++;
        }

        for(int i=1;i<10;i++){
            freq[i] += freq[i-1];
        }

        for(int i=0;i<10;i++){
            freq[i]--;
        }

        int[] ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int idx = freq[(arr[i]/exp)%10];
            ans[idx] = arr[i];
            freq[(arr[i]/exp)%10]--;
        }

        for(int i=0;i<ans.length;i++){
            arr[i] = ans[i];
        }
    }
}