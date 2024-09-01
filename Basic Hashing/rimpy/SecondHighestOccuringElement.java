import java.util.*;
public class SecondHighestOccuringElement{

    public static int SecondHighestOccuringElementApp1(int[] arr)
    {
        int n=arr.length;
        //int max_ele=-1;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }

        int max_count=0;
        int secMax_count=0;
        int max_ele=-1;
        int secMax_ele=-1;
        for(Map.Entry<Integer,Integer> it: m.entrySet())
        {
            int ele=it.getKey();
            int val=it.getValue();
            if(val>max_count)
            {
               secMax_count=max_count;
               max_count=val;
               secMax_ele=max_ele;
               max_ele=ele;
            }
            else if(val==max_count)
            {
                max_ele=Math.min(max_ele,ele);
            }
            else if(val>secMax_count)
            {
                secMax_count=val;
                secMax_ele=ele;
            }
            else if(val==secMax_count)
            {
                secMax_ele=Math.min(secMax_ele,ele);
            }
        }
        return secMax_ele;
    }


    public static void main(String[] args)
    {
        int[] arr={4, 4, 5, 5, 6, 7};
        System.out.println("Hello world");
        System.out.println("Printing second most occuring element "+SecondHighestOccuringElementApp1(arr));
    }
}