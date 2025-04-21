import java.util.Scanner;
public class PrintNameFiiveTimes
{
    public static void printNameFiveTimes(int count, int n)
    {
        if(count > n)
        {
            return;
        }
        //count++;
        System.out.println("This is the name of a number fiive times");
        printNameFiveTimes(count+1,n);
    }
    public static void printNumberNTimes(int count, int n)
    {
        if(count > n)
        {
            return;
        }
        //count++;
        System.out.println("Value of count "+count);
        printNumberNTimes(count+1,n);
    }
    public static void printNumberNTimesReverse(int count, int n)
    {
        if(count > n)
        {
            return;
        }
        printNumberNTimesReverse(count+1,n);
        System.out.println("Value of count "+count);
    }
    public static void printNumberNTimesUsingBacktracking(int n)
    {
        if(n < 0)
        {
            return;
        }
        printNumberNTimesUsingBacktracking(n-1);
        System.out.println("Value of count "+n);
    }
    public static void printNumberNTimesUsingBacktrackingReverse(int count, int n)
    {
        if(count > n)
        {
            return;
        }
        printNumberNTimesUsingBacktrackingReverse(count+1,n);
        System.out.println("Value of count "+count);
    }


    public static void sumOfNNoParameterized(int n, int sum)
    {
        if(n<0)
        {
            System.out.println(sum);
            return;
        }
        sumOfNNoParameterized(n-1,sum+n);
    }
    public static int sumOfNNoFunctional(int n)
    {
        if(n<1)
        {
            //System.out.println(sum);
            return 0;
        }
        return n + sumOfNNoFunctional(n-1);
    }

    public static void factorialParameterized(int n,int fact)
    {
        if(n<1)
        {
            System.out.println(fact);
            return;
        }
        factorialParameterized(n-1,fact*n);
    }

    public static long factorialFuncational(long n)
    {
        if(n<1)
        {
            //System.out.println(fact);
            return 1;
        }
        return n * factorialFuncational(n-1);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        //System.out.println(n+" is a number fiive times");
        //printNameFiveTimes(0,n);  //O(N) - TC, O(N) - SC
        //printNumberNTimes(0,n);  //O(N) - TC, O(N) - SC
        //printNumberNTimesReverse(0,n);  //O(N) - TC, O(N) - SC
        //printNumberNTimesUsingBacktracking(n); //On the way forward, we go deeper.
        //On the way backward (backtracking), we can print the numbers(keeping rest of the statements after the function call).
        //printNumberNTimesUsingBacktrackingReverse(0,n);
       // sumOfNNoParameterized(n, 0);
        //System.out.println(sumOfNNoFunctional(n));
        //factorialParameterized(n,1);
        System.out.println("Enter a number for long");
        long l = input.nextLong();
        long f = factorialFuncational(l);
        System.out.println(f);
    }
}
