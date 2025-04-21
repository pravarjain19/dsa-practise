import java.util.Scanner;
public class PalindromeString
{
    public static boolean PalindromicString(int i, int n, String s)
    {
        if(i>=n/2)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1))
        {
            return false;
        }
        return PalindromicString(i+1, n, s);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s= sc.nextLine();
        boolean b = PalindromicString(0, s.length(), s);
        System.out.println(b);
    }
}