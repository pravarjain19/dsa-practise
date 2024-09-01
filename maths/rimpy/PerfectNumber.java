import java.util.*;

public class PerfectNumber{
    //Approach 1 O(n)
    public static boolean PerfectNumberApp1(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(n==sum)
        {
            return true;
        }
        return false;
    }
    //Approach 2 TC : O(sqrt(n))

    public static boolean PerfectNumberApp2(int n)
    {
        int sum=1;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                sum+=i;
                if(i!=(n/i))
                {
                     sum+=(n/i);
                }
            }
           
        }

        if(n==sum)
        {
            return true;
        }
        return false;
    }




    public static void main(String[] args)
    {
        System.out.println("Hello world");
        System.out.println("Perfect number approach 1 "+PerfectNumberApp1(61));
        System.out.println("Perfect number approach 2 "+PerfectNumberApp2(28));
    }
}