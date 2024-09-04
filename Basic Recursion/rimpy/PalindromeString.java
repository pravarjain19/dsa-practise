public class PalindromeString{

    //Approach 1 TC : O(N), SC : O(N)

    public static boolean PalindromeStringApp1(String s,int left,int right)
    {
        //Base case 
        if(left>=right)
        {
            return true;
        }
        
        if(s.charAt(left)!=s.charAt(right))
        {
            return false;
        }

       return PalindromeStringApp1(s,left+1,right-1);
    }
    public static void main(String[] args)
    {
        System.out.println("Priting result "+PalindromeStringApp1("NAMANA",0,5));
        System.out.println("Hello world ");
    }
}