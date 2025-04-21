import java.util.*;
public class PrintingSubsequences {
    public static void printArray(List<Integer> lst)
    {
        for(int i=0;i<lst.size();i++)
        {
            System.out.println(lst.get(i));
        }
        return;
    }
    public static void printingSubsequences(int index, List<Integer> lst, List<Integer> lst2, int n){
        if(index == n)
        {
            System.out.println(lst2);
            return;
        }
        lst2.add(lst.get(index));
        printingSubsequences(index+1, lst, lst2, n);
        lst2.remove(lst.get(index));
        printingSubsequences(index+1, lst, lst2, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number " + i);
            int no = sc.nextInt();
            lst.add(no);
        }
        System.out.println("list"+ lst);
        printingSubsequences(0, lst, lst2, n);
    }
}