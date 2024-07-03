package DSA2.Array;

public class SpiralMatrix {
    public static int[] SpiralMatrix(int[][] arr)
    {
        int i=0,j=0,k=0,l=0,m=1,total=arr.length*arr[0].length,p=arr[0].length,n=arr.length;
        int[] ans=new int[total];
        if(arr[0].length==1)
        {
            while(k<total)
            {
                ans[k]=arr[i][0];
                k++;
                i++;
            }
            print(ans);
        }
        else{
            while(k<total)
            {
                while(j<p)
                {
                    ans[k]=arr[i][j];
                    j++;
                    k++;
                }
                i++;
                j--;
                while(i<n)
                {
                    ans[k]=arr[i][j];
                    k++;
                    i++;
                }
                i--;
                j--;
                while(j>=l)
                {
                    ans[k]=arr[i][j];
                    k++;
                    j--;
                }
                i--;
                j++;
                while(i>=m)
                {
                    ans[k]=arr[i][j];
                    i--;
                    k++;
                }
                j++;
                p--;
                i++;
                l++;
                m++;
                n--;
            }
            print(ans);
        }

        return ans;
    }
    public static void print(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }


    public static void main(String[] args)
    { int[][] array1={{10,20,30,40,170},{50,60,70,80,180},{90,100,110,120,190},{130,140,150,160,200},{201,202,203,204,205}};
        //int[][] array1={{1},{3},{5}};
        SpiralMatrix(array1);

    }
}
