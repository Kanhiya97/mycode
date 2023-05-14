import java.util.Arrays;
public class UnionOfTwoArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2};
        System.out.println(countUnion(a,b));
    }
    public static int countUnion(int[] a,int[] b){
        Arrays.sort(b); 
        int cnt = b.length;
        for(int i=0;i<a.length;i++){
            int val = a[i];
            if(isPresent(val,b)==false){
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean isPresent(int val,int[] b){
        int l=0, h=b.length-1;

        while(l<=h){
            int mid = l +(h-l)/2;
            if(b[mid]==val){
                return true;
            }else if(b[mid]>val){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return false;
    }
}
