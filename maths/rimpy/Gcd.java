import java.util.*;
public class Gcd{
    //Approach 1 O(min(N))
    public static int GcdApp1(int n1,int n2)
    {
        int val=(n1>n2?n1:n2);
        int max_digit=Integer.MIN_VALUE;
        for(int i=1;i<=val;i++)
        {
            int m=0;
            if(n1%i==0 && n2%i==0)
            {
                m=i;
            }
            if(m>max_digit)
            {
                max_digit=m;
            }
        }
        return max_digit;
    }

    //Approach 2 : Reverse iterating to reduce no. of operations even the time complexity will remain same TC : O(min(N))
    public static int GcdApp2(int n1,int n2)
    {
        int val=(n1>n2?n1:n2);
        for(int i=val;i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                return i;
            }
            
        }
        return 0;
    }


    //Approach 3 using Euclidean Algorithm TC : O(log(min(N)))
    public static int GcdApp3(int n1,int n2)
    {
        int r1=(n1>n2?n1:n2);
        int r2=(n1<n2?n1:n2);
        while(r2!=0)
        {
            int rem=r1%r2;
            r1=r2;
            r2=rem;
        }
        return r1;
    }



    public static void main(String[] args)
    {
        System.out.println("Hello world");
        System.out.println("GCD of a number approach 1 "+GcdApp1(9,8));
        System.out.println("GCD of a number approach 2 "+GcdApp2(4,6));
        System.out.println("GCD of a number approach 3 "+GcdApp3(25,60));
    }
}