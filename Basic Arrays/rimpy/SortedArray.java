public class SortedArray{

    //Approach 1 TC: O(N), SC: O(1)
    public static boolean SortedArrayApp1(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,5,6,7,9};
        int[] arr2={9,6,8,3,8,4,8};
        System.out.println(SortedArrayApp1(arr2));
    }
}