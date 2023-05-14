// wap to find greatest sum of sub arrays (Leetcode 53)
public class KadaneAlgo{
    public static int maxOfSum(int[] arr){
        int max = arr[0];
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum>max){
                max = currSum;
            }
            if(currSum<0){
                currSum = 0;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxOfSum(arr));
    }
}
