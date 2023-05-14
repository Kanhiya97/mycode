public class Practice{
    public static void main(String[] args) {
       long arr[] = {1,2,3,4,5};
       System.out.println(getSum(arr));
    }
    public static long getSum(long arr[]){
        long sum = 0;
        for(long i=0l;i<arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }
}