import java.util.*;

public class QuickSort {
    public static void quickSort(ArrayList<Integer> list, int low, int high)
    {
        System.out.println("value of low : " + low + " value of high: " + high);
        if(low >= high)
        {
            return;
        }
        int pivot_index = low;
        int partition_index=fun(list,pivot_index,low,high);
        quickSort(list,low,partition_index-1);
        quickSort(list,partition_index+1, high);
    }

//    private static void swap(ArrayList<Integer> list, int low, int high)
//    {
//        int temp=list.get(low);
//        list.set(low,list.get(high));
//        list.set(high,temp);
//        list.set(low+1,high);
//    }

    private static int fun(ArrayList<Integer> list, int pivotIndex, int low, int high) {
        System.out.println("value of lowww : " + low + " value of highhh: " + high +"value of pivotIndex: " + pivotIndex);
        int i = low;
        int j = high;
        while(i<j)
        {
            while(i<=high && list.get(i)<=list.get(pivotIndex))
            {
                i++;
            }
            while(j>=low && list.get(j)>=list.get(pivotIndex))
            {
                j--;
            }
            System.out.println(i+" value "+j);
            if(i<j)
            {
                Collections.swap(list,i,j);
                //swapping
            }
        }
        //swapping
        Collections.swap(list,pivotIndex,j);
        return j;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements in the array");
            arr.add(sc.nextInt());
        }
        quickSort(arr,0,n-1);
        System.out.println("Sorted array "+arr);
    }
}
