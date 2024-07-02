package DsaPractice;

public class minJump {
    public static int jump(int[] arr)
    {
        int totaljumps=0;
        int destination=arr.length-1;
        int coverage=0,lastjumpind=0;
        if(arr.length==1)
        {
            return 0;
        }
        for(int i=0;i< arr.length;i++)
        {
            coverage=Math.max(coverage,i+arr[i]);
            if(i==lastjumpind)
            {
                lastjumpind=coverage;
                totaljumps++;
                if(coverage>=destination)
                {
                    return totaljumps;
                }
            }
        }
        return totaljumps;
    }
    public static void main(String[] args)
    {
        int[] arr={2,3,0,2,3,1,1,1};
        System.out.println(jump(arr));
    }

}
