import java.util.*;
public class Factorial{

    //Approach 1 using loop (TC: O(N), SC: O(1))
    static int FactorialApp1(int n)
    {
        int num=1;
        while(n!=0)
        {
            num=num*n;
            n--;
        }
        return num;
    }


    //Approach 2 using recursion (TC: O(N), SC: O(N))
    static int FactorialApp2(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*FactorialApp2(n-1);
    }

    public static void main(String[] args)
    {
       System.out.println("Hello worldd");
       System.out.println("Factorial Approach 1 "+ FactorialApp1(3)); 
       System.out.println("Factorial Approach 2 "+FactorialApp2(6));
    }
}