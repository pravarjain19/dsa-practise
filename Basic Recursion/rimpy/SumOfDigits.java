public class SumOfDigits {

    //Approach 1 : TC : O(logN), SC: O(logN)
    public static int SumApp1(int n)
    {
        if(n<10)
            return n;
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }

        return SumApp1(sum);
    }
    public static void main(String[] args)
    {
        System.out.println("Sum of digits of a number is "+ SumApp1(529));
    }
}