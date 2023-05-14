public class ShiftZeroesOnes{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        shiftValues(arr);
        for(int x:arr){
            System.out.print(x +" ");
        }
    }
    public static void shiftValues(int[] arr){
        int i=0, j=arr.length-1;

        while(i<=j){
            if(arr[j]==1){
                j--;
            }else if(arr[i]==1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else{
                i++;
            }
        }
    }
}