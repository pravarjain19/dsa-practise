public class ReverseArray{

    //TC : O(N) , SC : O(N)
    private static void ReverseArr1(int[] nums,int left,int right)
    {
        if(left>=right)
            return;

        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;

        ReverseArr1(nums,left+1,right-1);
    }

    public static int[] reverseArray(int[] nums) {
        //your code goes here
        int n=nums.length;
        ReverseArr1(nums,0,n-1);
        return nums;
    }

    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5,6,7};
        reverseArray(nums);
        for(int i:nums)
        {
            System.out.print(i+ " ");
        }
    }
}