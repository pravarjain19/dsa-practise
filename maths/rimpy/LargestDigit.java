import java.util.*;
public class LargestDigit{
    //Approach 1 : O(logn)
    public static int LargestDigitApp1(int n)
    {
        int l=Integer.MIN_VALUE;
        int rem=0;
        while(n!=0)
        {
            rem=n%10;
            if(rem>l)
            {
                l=rem;
            }
            n=n/10;
        }
        return l;
    }
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        System.out.println("Largest Digit of a number "+LargestDigitApp1(129456));
    }
}