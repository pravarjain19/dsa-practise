import java.util.*;

public class MergeSort {
    public static void merge(ArrayList<Integer> list, int low, int mid, int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = low;
        int j = mid + 1;
        while(i<=mid&&j<=high){
            if(list.get(i)<list.get(j)){
                temp.add(list.get(i));
                i++;
            }
            else{
                temp.add(list.get(j));
                j++;
            }
        }
        while(i<=mid){
            temp.add(list.get(i));
            i++;
        }
        while (j<=high){
            temp.add(list.get(j));
            j++;
        }
        for(int k=0;k<temp.size();k++){
            list.set(low+k,temp.get(k));
        }
    }
    public static void mergeSort(ArrayList<Integer> list,int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(list,low,mid);
        mergeSort(list,mid+1,high);
        merge(list,low,mid,high);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1));
            list.add(sc.nextInt());
        }
        mergeSort(list,0,n-1);
        System.out.println("merge sorted array"+list);
    }
}
