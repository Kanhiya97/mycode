public class Recursion3 {
    public static void printTable(int n, int i){
        if(i==11){
            return;
        }

        System.out.print(n*i +"  ");
        printTable(n, i+1);
    }
    public static void main(String[] args) {
        int n = 5;
        printTable(n,1);
    }
}
