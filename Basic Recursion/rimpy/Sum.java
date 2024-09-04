public class Sum{

    //Approach 1 : TC : O(N), SC: O(N)

    public static int SumApp1(int[] nums,int index)
    {
        int n=nums.length;
        if(index>n-1)
        {
            return 0;
        }
        return nums[index]+SumApp1(nums,index+1);
    }
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,7};
        System.out.println("Sum of all elements are "+SumApp1(nums,0));
    }
}