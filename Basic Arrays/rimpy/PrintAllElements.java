public class PrintAllElements{
    public static void PrintElementApp1(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        //return 0;

    }

    public static int SumElementApp1(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            //System.out.println(arr[i]);
        }
        return sum;

    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6};
        System.out.println("Hello world");
        System.out.println("Printing all the elements");
         PrintElementApp1(arr);
        System.out.println("Sum of all integer "+ SumElementApp1(arr));
    }
}