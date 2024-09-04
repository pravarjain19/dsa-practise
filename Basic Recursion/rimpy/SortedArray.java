import java.util.*;

public class SortedArray{

    //TC : O(N), SC: O(N)
    public static boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        int n=nums.size();
        return sort(nums,0,1);
    }

    private static boolean sort(ArrayList<Integer> nums,int left,int right) {
        //your code goes here
        int n=nums.size();
        if(n==1)
            return true;
        if(right==n)
            return true;
        
        if(nums.get(left)>nums.get(right))
            return false;
        
        return sort(nums,left+1,right+1);
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr=Arrays.List.of(9,1)
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(500);
        arr.add(60);
        System.out.println("Given array is sorted true or false? "+isSorted(arr));
    }
}