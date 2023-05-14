public class BinarySearch {
    public static int binary(int[] arr,int x){
        int left=0,right=arr.length-1;
        
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,8,10,23,45};
        int x = 1;
        System.out.println(binary(arr,x));
    }
}
