public class LinearSearch{
    public static int linear(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = {3,2,5,1,76,45,9,8};
        int x = 4;
        System.out.println(linear(arr,x));
    }
}