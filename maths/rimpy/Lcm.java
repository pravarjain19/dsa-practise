import java.util.*;
public class Lcm{

    //Approach 1 O(N1*N2)
    public static int LcmApp1(int n1,int n2)
    {
        int i=1;
        int ans=0;

        while(true)
        {
            int m=Math.max(n1,n2);
            ans=m*i;
            if(ans%n1==0 && ans%n2==0)
            {
                break;
            }
            else{
                i++;
            }
        }
        return ans;
    }

    //Approach 2 using GCD TC : O(log(min(n1,n2))
    public static int LcmApp2(int n1,int n2)
    {
        int result = GcdApp(n1,n2);
        int ans=(n1*n2)/result;
        return ans;
    }    


    // TC : O(log(min(n1,n2))
    public static int GcdApp(int n1,int n2)
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
        System.out.println("LCM Of a number approach 1 "+LcmApp1(10,8));
        System.out.println("LCM Of a number approach 2 "+LcmApp2(40,30));
    }

}