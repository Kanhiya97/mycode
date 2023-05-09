package operators;

public class LogicalOperator3{
    public static void main(String[] args) {
        //&& will not solve all the conditions if first false comes
        //& will solve all the conditions and at the end it will give the answer
        System.out.println(10%1==1 && 10%0==0);//false
        //System.out.println(10%1==1 & 10%0==0);//exception

        //|| will not solve all the conditions if first TRUE comes
        //| will solve all the conditions and at the end it will give the answer
        System.out.println(10%1==0 || 10%0==0);//true
        //System.out.println(10%1==1 | 10%0==0);//exception
        System.out.println(!true);//false
        System.out.println(!false);//true
        //System.out.println(!10);//CTE
    }
}