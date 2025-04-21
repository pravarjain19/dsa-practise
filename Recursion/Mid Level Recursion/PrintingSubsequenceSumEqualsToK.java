import java.util.*;

public class PrintingSubsequenceSumEqualsToK {
    public static void print(int index, List<Integer>list1, List<Integer>list2, int sum, int k, int n) {
        if (index >= n) {
            if(sum==k)
            {
                System.out.println(list2);
            }
            return;
        }
        list2.add(list1.get(index));
        sum+=list1.get(index);
        print(index+1, list1, list2, sum, k, n);
        list2.remove(list1.get(index));
        sum-=list1.get(index);
        print(index+1, list1, list2, sum, k, n);
    }
    public static boolean printOnlyOne(int index, List<Integer>list1, List<Integer>list2, int sum, int k, int n) {
        if (index >= n) {
            if(sum==k)
            {
                System.out.println(list2);
                return true;
            }
            return false;
        }
        list2.add(list1.get(index));
        sum+=list1.get(index);
        if(printOnlyOne(index+1, list1, list2, sum, k, n)){
            return true;
        }
        list2.remove(list1.get(index));
        sum-=list1.get(index);
        if(printOnlyOne(index + 1, list1, list2, sum, k, n)){
            return true;
        }
        return false;
    }
    public static int countSubsequence(int index, List<Integer>list1, List<Integer>list2, int sum, int k, int n, int count) {
        if (index >= n) {
            if(sum==k)
            {
                System.out.println(list2);
                count++;
                return count;
            }
            return count;
        }
        list2.add(list1.get(index));
        sum+=list1.get(index);
        count = countSubsequence(index+1, list1, list2, sum, k, n, count);
        list2.remove(list1.get(index));
        sum-=list1.get(index);
        count = countSubsequence(index+1, list1, list2, sum, k, n, count);
        return count;
    }
    public static int countSubsequenceApp2(int index, List<Integer>list1, List<Integer>list2, int sum, int k, int n) {
        if (index >= n) {
            if(sum==k)
            {
                System.out.println(list2);
                return 1;
            }
            return 0;
        }
        list2.add(list1.get(index));
        sum+=list1.get(index);
        int l = countSubsequenceApp2(index+1, list1, list2, sum, k, n);
        list2.remove(list1.get(index));
        sum-=list1.get(index);
        int r = countSubsequenceApp2(index+1, list1, list2, sum, k, n);
        return l+r;
    }
    public static void subsequenceLargestLengthSumEqualsToK(int index, List<Integer>list1, List<Integer>list2, List<Integer> finalList , int sum, int k, int n, int[] len) {
        if (index >= n) {
            System.out.println("length "+ index + " " + len[0]);
            if(sum==k && len[0] < list2.size())
            {
                len[0] = list2.size();
                System.out.println("lengthhhhhhh "+len[0]);
                finalList.clear();
                finalList.addAll(list2);
            }
            return;
        }
        list2.add(list1.get(index));
        sum+=list1.get(index);
        subsequenceLargestLengthSumEqualsToK(index+1, list1, list2, finalList, sum, k, n, len);
        list2.remove(list1.get(index));
        sum-=list1.get(index);
        subsequenceLargestLengthSumEqualsToK(index+1, list1, list2, finalList, sum, k, n, len);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            System.out.println("enter "+i);
            list1.add(sc.nextInt());
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        int[] len = new int[1];
        //print(0,list1,list2,0,k,n);
        //printOnlyOne(0,list1,list2,0,k,n);
//        int count = countSubsequence(0,list1,list2,0,k,n,0);
//        System.out.println("No. of subsequences are "+count);
//        int count = countSubsequenceApp2(0,list1,list2,0,k,n);
//        System.out.println("No. of subsequences are "+count);
        List<Integer> finalList = new ArrayList<>();
        subsequenceLargestLengthSumEqualsToK(0,list1,list2,finalList,0,k,n,len);
        System.out.println("final list "+ finalList);
    }
}
