import java.util.*;
public class DivisorOfANumber{
    
    //Approach 1 TC: O(N), SC: O(sqrt(N))
    public static int[] DivisorOfANumberApp1(int n)
    {
     int arr[]=new int[n];
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                arr[count]=i;
                count++;
            }
        }
        //Before returning it copy the arr into exact size
        int[] result=Arrays.copyOf(arr,count);
        return result;
    }


    public static int[] DivisorOfANumberApp2(int n)
    {
     int arr[]=new int[n];
        int count=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                arr[count]=i;
                count++;
                if(i!=(n/i))
                {
                    arr[count]=(n/i);
                    count++;
                }
            }
        }
        //Before returning it copy the arr into exact size
        int[] result=Arrays.copyOf(arr,count);
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello world");
        int[] ans=DivisorOfANumberApp1(100);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }

        System.out.println("Approach 2");
        int[] ans2=DivisorOfANumberApp2(100);
        for(int i=0;i<ans2.length;i++)
        {
            System.out.println(ans2[i]);
        }
    }
}