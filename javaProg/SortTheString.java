import java.util.TreeMap;
public class SortTheString{
    public static void sortString(String[] arr){
        TreeMap<Integer,String>map = new TreeMap<>();
        
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            int idx = 0;
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                if(Character.isDigit(ch)){
                    idx *= 10;
                    idx += (int)ch;
                }
            }
            map.put(idx,str);
        }

        int j = 0;
        for(Integer k:map.keySet()){
            arr[j] = map.get(k);
            j++;
        }

    }
    public static void main(String[] args){
        String[] arr = {"Mohan3","0my","i2s","na1me"};
        for(String x:arr){
            System.out.print(x +" ");
        }
        System.out.println();
        sortString(arr);
        for(String x:arr){
            System.out.print(x +" ");
        }
    }
}