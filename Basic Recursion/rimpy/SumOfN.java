public class SumOfN{

    // Approach 1
    public static int SumOfNApp1(int n)
    {
        //Base case
        if(n==1)
        {
            return 1;
        }

        return n+SumOfNApp1(n-1);        
    }
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        System.out.println("Printing the sum of N Numbers "+SumOfNApp1(4));
    }
}