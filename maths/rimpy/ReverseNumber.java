public class ReverseNumber{

    //Approach 1 of reversing the number TC: O(logn)
    public static int ReverseNumberApp1(int n)
    {
        int num=0;
        while(n!=0)
        {
            int rem=n%10;
            num=num*10+rem;
            n=n/10;
        }
        return num;
    }

    public static void main(String[] args)
    {
        System.out.println("Rimpy Mittal");
        System.out.println("Reverse of a number approach 1 "+ ReverseNumberApp1(105600));
    }
}