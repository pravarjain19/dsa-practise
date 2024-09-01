public class CountOfOddNumber{
    public static int CountNumberApp(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr={6,7,8,92,5,67,1,34,6,8,8};
        System.out.println("Hello world");
        System.out.println("Count of Odd Numbers in an Array "+CountNumberApp(arr));
    }
}