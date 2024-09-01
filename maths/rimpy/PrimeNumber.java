public class PrimeNumber{
    //Approach 1 O(n)
    public static boolean PrimeNumberApp1(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    //Approach 2 TC: O(sqrt(n))
    public static boolean PrimeNumberApp2(int n)
    {
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello world");
        System.out.println("Prime number approach 1 "+PrimeNumberApp1(13));
        System.out.println("Prime number approach 2 "+PrimeNumberApp2(14));
    }
}