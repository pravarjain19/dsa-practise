import java.util.*;


public class HighestOccuringElement{

    public static int HighestOccuringElementApp1(int[] arr)
    {
        int n=arr.length;
        int max_ele=0;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }

        int max_count=0;
        for(Map.Entry<Integer,Integer> it: m.entrySet())
        {
            int val=it.getValue();
            if(val>max_count)
            {
                max_count=val;
                max_ele=it.getKey();
            }
            else if(val==max_count)
            {
                max_ele=Math.min(max_ele,it.getKey());
            }
        }
        return max_ele;
    }

    public static void main(String[] args)
    {
        int[] arr={7,4,6,7,5,8,8,5,7,5,4,7,4,8,8,8,7};
        System.out.println("Hello world");
        System.out.println("Highest Occuring Element is "+HighestOccuringElementApp1(arr));
    }
}