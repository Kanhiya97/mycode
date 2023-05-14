// count total paths in maze
public class CountPaths{
    public static int countPath(int i,int j,int m,int n){
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        int downPaths = countPath(i+1, j, m, n);
        int rightpaths = countPath(i, j+1, m, n);
        return downPaths+rightpaths;
    }
    public static void main(String[] args){
        int m=3, n=4;
        int totalPaths = countPath(0, 0, m, n);
        System.out.println(totalPaths);
    }
}
