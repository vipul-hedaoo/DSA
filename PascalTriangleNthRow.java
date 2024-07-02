package DsaPractice;

public class PascalTriangleNthRow {
    public static int[] getRow(int A) {
        int[] ans=new int[A+1];
        if(A==0)
            return ans;
        int prev = 1;
        ans[0]=prev;
        for(int i = 1; i <= A; i++)
        {

            // nCr = (nCr-1 * (n - r + 1))/r
            int curr = (prev * (A - i + 1)) / i;
            ans[i]=curr;
            prev = curr;
        }
        print(ans);
        return  ans;
    }
    public static int[] getRowAP2(int A) {
        int[] ans=new int[A+1];
        if(A==0)
            return ans;
        int prev = 1,i=1,j=A-1;
        ans[0]=prev;
        ans[A]=prev;
        while(i<=j)
        {
            // nCr = (nCr-1 * (n - r + 1))/r
            int curr = (prev * (A - i + 1)) / i;
            ans[i]=curr;
            ans[j]=curr;
            i++;
            j--;
            prev = curr;
        }
        print(ans);
        return  ans;
    }
    public static void print(int[] ans)
    {
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        getRowAP2(20);
        getRow(10);
    }

}
