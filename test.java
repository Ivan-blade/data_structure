import java.util.*;

public class test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int len = input.nextInt();
            int[] arr = new int[len];
            for(int i = 0;i<arr.length;i++) {
                int temp = input.nextInt();
                arr[i] = temp;
            }
            Arrays.sort(arr);
            int[] res = deal(arr);
            for(int n : res) {
                System.out.println(n);
            }
        }
    }
    public static int[] deal(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length-1 ;i++) {
            if(arr[i] != arr[i+1]) temp[index++] = arr[i];
        }
        int[] res = new int[index];
        System.arraycopy(temp,0,res,0,index);
        return res;
    }
    public static void quick(int[] arr,int left,int right) {
        if(left>=right) return;
        int lo = left;
        int cur = left+1;
        while(cur<=right) {
            if(arr[cur] <= arr[left]) {
                swap(arr,cur,lo+1);
                lo++;
            }
            cur++;
        }
        swap(arr,left,lo);
        quick(arr,left,lo-1);
        quick(arr,lo+1,right);
    }
    
    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}