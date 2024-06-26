package DSA2.Array;


public class kadesAlgorithum {
    public static void KadesAlgoApproch1(int[] arr)
    {
        int maxcount=0,curcount=0,indexstart=0,indexend=0;
        for(int i=0;i<arr.length;i++)
        {
            curcount+=arr[i];
            if(curcount>maxcount)
            {
                maxcount=curcount;
                indexend=i;
            }
            if(curcount<0)
            {
                curcount=0;
                indexstart++;
            }
        }
        System.out.println("max sum array is "+maxcount);
        for(int j=indexstart;j<=indexend;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
//this Stocks Buy and Sell approch is has TC O(n) SC O(n)
    public static int StockBuySell(int[] arr)
    {
        int[] aux=new int[arr.length];
        int maxpofit=arr[0],prev=arr[arr.length-1];
        for(int n= arr.length-1;n>=0;n--)
        {
            aux[n]=Math.max(arr[n],prev);
            prev=aux[n];
        }
        for(int i=0;i< arr.length;i++)
        {
            maxpofit=Math.max(maxpofit,aux[i]-arr[i]);
        }
        return maxpofit;
    }
    //Approch 2 with TC O(n) SC O(1)
public static int maxprofit(int[] arr)
{
    int minsofar=arr[0],maxprofit=0;
    for(int i=0;i<arr.length;i++)
    {
        minsofar=Math.min(minsofar,arr[i]);
        maxprofit=Math.max((arr[i]-minsofar),maxprofit);
    }
    return maxprofit;
}
public static int Maxprofitintreading(int[] arr)
{
    int profit=0;
    for(int i=1;i< arr.length;i++)
    {
        if(arr[i]>arr[i-1])
        {
            profit+=arr[i]-arr[i-1];
        }
    }
    return profit;
}



    public static  void main(String[] args)
    {
        int[] arr={4,6,-3,3,-1,-5};
        int[] arr1={3,5,1,7,4,9,3};
        KadesAlgoApproch1(arr);
        System.out.println("\nstock");
        System.out.println( StockBuySell(arr1));
        System.out.println( maxprofit(arr1));
        System.out.println( Maxprofitintreading(arr1));
    }
}
