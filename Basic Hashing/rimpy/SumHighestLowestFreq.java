import java.util.*;
public class SumHighestLowestFreq{

    //Approach 1 TC : O(N), SC : O(N)
    public static int SumHighestLowestFreqApp1(int[] arr)
    {
        int n=arr.length;
        int max_count=0;
        int min_count=Integer.MAX_VALUE;
        int max_ele=-1;
        int min_ele=-1;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> it: m.entrySet())
        {
            int ele=it.getKey();    //array value
            int val=it.getValue();  //frequency 
            if(val>max_count)
            {
                max_count=val;
                max_ele=ele;
            }
            else if(val==max_count)
            {
                max_ele=Math.min(max_ele,ele);
            }
            if(val<min_count)
            {
                min_count=val;
                min_ele=ele;
            }
            else if(val==min_count)
            {
                min_ele=Math.min(min_ele,ele);
            }
        }
        System.out.println("Printing maximum count " + max_count + " element " + max_ele);
        System.out.println("Printing minimum count " + min_ele + " element " + min_ele);
        return max_count + min_count;
    }


    public static void main(String[] args)
    {
        int[] arr={2,3,4,4,5};
        System.out.println("Hello world ");
        System.out.println("Sum of Highest and Lowest frequency " + SumHighestLowestFreqApp1(arr));
    }
}