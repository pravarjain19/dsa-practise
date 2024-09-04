public class Factorial {

    //Approach 1 : TC : O(N), SC: O(N)
    public static int FactApp1(int n)
    {
        if(n==1)
            return 1;
        return n * FactApp1(n-1);
    }
    public static void main(String[] args)
    {
        System.out.println("Factorial of a number is "+ FactApp1(5));
    }
}