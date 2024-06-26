package DSA2.Array;

import java.util.Arrays;

public class MejorityElement {
public static void Approch1(int[] array)
{ int count=0,maxcount=1,index=0;
    for(int i=0;i< array.length;i++)
    {
        int m=array[i];
        for(int j=0;j< array.length;j++)
        {
            if(m==array[j])
            {
                count++;
            }
        }
        if(count>maxcount)
        {
            maxcount=count;
            index=i;
        }
        count=0;
    }
    System.out.println(array[index]+" appear "+maxcount+"times");
}
public static void Approch2(int[] array)
{
    //using sorting
    Arrays.sort(array);
    int n=0,count=0,maxcount=0;
    for(int i=0;i< array.length;i++)
    {
        if(array[n]==array[i])
        {
            count++;
        }
        else{
            n=i;
            if(count>maxcount)
            {
                maxcount=count;
            }
            count=0;
        }

    }
    System.out.println("appear "+maxcount+" times");
}
public static void Approch3(int[] array)
{
    int maxcount=0,count=1,ansindex=0;
    for(int i=1;i<array.length;i++)
    {
        if(array[i]==array[ansindex])
        {
            count++;
        }
        else{
            count--;
        }
        if(count==0)
        {
            ansindex=i;
            count=1;
        }
    }
    count=0;
    for(int j=0;j<array.length;j++)
    {
        if(array[ansindex]==array[j])
        {
            count++;
        }
    }
    if(count> array.length/2)
    {
        System.out.println(array[ansindex]+" is appear "+count+" times");
    }
}



    public static void main(String[] args)
    {
      int[] array={3,3,2,2};
      Approch1(array);
      Approch2(array);
      Approch3(array);
    }

}
