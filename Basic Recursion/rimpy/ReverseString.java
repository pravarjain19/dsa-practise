import java.util.*;

public class ReverseString{

    private void reverseStr(Vector<Character> s,int left,int right)
    {
        if(left>=right)
            return;
        
        char ch=s.get(left);
        s.set(left,s.get(right));
        s.set(right,ch);

        reverseStr(s,left+1,right-1);
    }


    public Vector<Character> reverseString(Vector<Character> s) {
        //your code goes here
            int n=s.size();
            reverseStr(s,0,n-1);
            return s;
    }

    public static void main(String[] args)
    {
        ReverseString r=new ReverseString();
        Vector<Character> s = new Vector<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        r.reverseString(s);
        System.out.println("Reversed string ");
        for(char ch:s)
        {
            System.out.println(ch+" ");
        }
    }
}