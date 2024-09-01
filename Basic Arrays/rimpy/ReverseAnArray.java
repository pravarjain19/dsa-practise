public class ReverseAnArray{

    //Approach 1 TC: O(N)*2 , SC: O(N)
    public static void ReverseArrayApp1(int[] arr)
    {
        int n=arr.length;
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            result[n-i-1]=arr[i];
        }

        //copy the elements in original array 
        for(int i=0;i<n;i++)
        {
            arr[i]=result[i];
        }
        return ;
    }

    //By swapping TC: O(N), SC: O(1)
    public static void ReverseArrayApp2(int[] arr)
    {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return ;
    }

    public static void main(String[] args)
    {
        int[] arr={4,5,6,7,8,2};
        System.out.println("Hello world");
        //ReverseArrayApp1(arr);
        ReverseArrayApp2(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}