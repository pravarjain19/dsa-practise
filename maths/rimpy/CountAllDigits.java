import java.util.*;
public class CountAllDigits{

    //Approach 1 using loop (TC: O(logN), SC: O(1))
    static int CountAllDigitsOfNumberApp1(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }


    //Approach 2 using log function(TC: O(1), SC: O(1))
    static int CountAllDigitsOfNumberApp2(int n)
    {
        int count=(int) Math.floor(Math.log10(n))+1;
        return count;
    }
    public static void main(String[] args)
    {
       System.out.println("Hello worldd");
       System.out.println("Count of Digits Approach 1 "+ CountAllDigitsOfNumberApp1(3450)); 
       System.out.println("Count of Digits Approach 2 "+CountAllDigitsOfNumberApp2(34500099));
    }
}