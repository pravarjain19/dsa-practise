public class Palindrome{
    //Approach 1 O(logn)
    public static boolean PalindromeApp1(int n)
    {
        int num2=0;
        int num1=n;
        while(n!=0)
        {
            int rem=n%10;
            num2=num2*10+rem;
            n=n/10;
        }
        if(num1==num2)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello world");
        System.out.println("Palindrome of a number approach 1 "+PalindromeApp1(999));
    }
}