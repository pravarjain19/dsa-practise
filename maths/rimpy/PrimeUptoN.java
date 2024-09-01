public class PrimeUptoN{
    
    //Approach 1 O(N^2)
    public static int PrimeUptoNApp1(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            boolean res=true;
            
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    res=false;
                }
            }
            if(res)
            {
                count++;
            }
        }
        return count;
    }

    //Approach 2 TC : O(Nsqrt(N))
    public static int PrimeUptoNApp2(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            boolean res=true;
            
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    res=false;
                }
            }
            if(res)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello world");
        System.out.println("Prime upto n approach 1 "+PrimeUptoNApp1(100));
        System.out.println("Prime upto n approach 2 "+PrimeUptoNApp2(100));
    }
}