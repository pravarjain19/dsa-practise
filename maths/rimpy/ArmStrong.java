import java.util.*;
public class ArmStrong{

    //Approach 1 using loop (TC: O(logN), SC: O(1))
    public static boolean ArmStrongApp1(int n)
    {
        int count=CountAllDigitsOfNumber(n);
        int num1=n;
        int num2=0;
        while(n!=0)
        {
            int rem=n%10;
            num2+=Math.pow(rem,count);
            n=n/10;
            
        }
        if(num1==num2)
        {
            return true;
        }
        return false;
    }


    static int CountAllDigitsOfNumber(int n)
    {
        int count=(int) Math.floor(Math.log10(n))+1;
        return count;
    }



    public static void main(String[] args)
    {
       System.out.println("Hello worldd");
       System.out.println("ArmStrong Approach 1 "+ ArmStrongApp1(370)); 
    }
}