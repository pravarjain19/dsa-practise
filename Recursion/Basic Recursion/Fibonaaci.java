import java.util.*;
public class Fibonaaci
{
    public static int FibonacciNumber(int n)
    {
        if(n<=1)
            {
            return n;
            }
        return FibonacciNumber(n-1)+FibonacciNumber(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        System.out.println(FibonacciNumber(n));
    }
}