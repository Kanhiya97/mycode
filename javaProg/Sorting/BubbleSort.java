public class BubbleSort{
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {45,3,1,2,36,7,1,1,0};
        bubble(arr);
        for(Integer x:arr){
            System.out.print(x +" ");
        }
    }
}