public class Fibonacci{
    public static int fib(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n == 0) return 0;
        if (n == 1) return 1;
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fib(n - 1) + fib(n - 2);
    }

    public static int FibonacciApp(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        
        return FibonacciApp(n-1) + FibonacciApp(n-2);
    }

    public static void main(String[] args)
    {
        System.out.println("Printing fibonacci "+FibonacciApp(4));
        System.out.println("Printing fibonacci "+fib(4));
    }
}