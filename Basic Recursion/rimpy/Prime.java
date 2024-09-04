import java.util.*;
public class Prime{

    //Approach 1 : TC : O(N), SC: O(N)

    public static boolean PrimeApp1(int nums,int val)
    {
        //Base Case
        if(val>=Math.sqrt(nums))
        {
            return true;
        }

        if(nums%val==0)
        {
            return false;
        }
        return PrimeApp1(nums,val+1);
    }


    public boolean checkPrime(int num) {
    // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false; 
        }
       // Call the helper function to check for primality
        return prime(num, 2); 
    }

    private boolean prime(int num, int x) {
        if (x > Math.sqrt(num)) {
            return true; 
        }
       // Found a divisor, so the number is not prime
        if (num % x == 0) {
            return false; 
        }
        // Recursive call with the next divisor
        return prime(num, x + 1); 
    }
    
    public static void main(String[] args)
    {
        System.out.println("prime no. "+PrimeApp1(17,2));
    }
}