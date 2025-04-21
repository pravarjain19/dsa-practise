import java.util.Scanner;
public  class ReverseAnArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
    public static void  ReverseArray(int i, int[] arr, int n) {
        if(i>=n/2)
        {
            return;
        }
        swap(arr, i, n-i-1);
        ReverseArray( i+1, arr, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of the array:");
            arr[i] = sc.nextInt();
        }
        ReverseArray(0, arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}