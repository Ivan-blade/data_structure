package al.soft;

public class quickSoft {
    public static void main(String args[]) {
        int[] arr = new int[] {1,3,2,7,4,8,4};
        soft(arr,0,arr.length-1);
    }
    public static void soft(int[] arr,int start,int end) {
        if(start < end) {
            int standard = arr[start];
            int low = start;
            int high = end;
            while(low < high) {
                while(low < high&& standard<=arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while(low<high&&arr[low]<=standard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = standard;
            soft(arr,start,low);
            soft(arr,low+1,end);
        }
    }
}