package al.soft;
public class BubbleSoft {
    public static void main(String args[]) {
        int[] arr = new int[] {1,4,2,6,3,5};
        soft(arr);
    }
    public static void soft (int[] arr) {
        for(int i = 0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}