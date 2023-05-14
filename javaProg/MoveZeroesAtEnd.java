public class MoveZeroesAtEnd {
    public static void moveZeroes(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[j]==0){
                j--;
            }else if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 3, 0, 2, 0, 1, 10, 13, 0};
        moveZeroes(arr);
        for(int x:arr){
            System.out.print(x +" ");
        }
    }
}
