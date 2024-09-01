public class CountOddDigits{

    //Approach 1 using loop(TC: O(logn), SC: O(1))
    static int CountOddDigitsOfNumberApp1(int n)
    {
        int count=0;
        while(n!=0)
        {
            int rem=n%10;
            if(rem%2!=0)   // no. is odd
            {
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        System.out.println("Printing count of odd digits approach 1 "+ CountOddDigitsOfNumberApp1(124400095));
    }
}