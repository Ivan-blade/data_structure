package softal;

public class merge{
    int arr[];

    // 归并排序是典型的使用分治思想（divide-and-conquer）解决问题的案例。
    // 在排序的过程中，把原来的数组变成左右两个数组，然后分别进行排序
    // 当左右的子数组排序完毕之后，再合并这两个子数组形成一个新的排序数组。
    // 整个过程递归进行，当只剩下一个元素或者没有元素的时候就直接返回。
    public merge(int[] temp) {
        mergesoft(temp, 0, temp.length - 1);
        this.arr = temp;
    }
    public void mergeSort(int[] nums, int left, int right) {  // 需要左右边界确定排序范围
        if (left >= right) return;
        int mid = (left+right) / 2;
    
        mergeSort(nums, left, mid);                           // 先对左右子数组进行排序
        mergeSort(nums, mid+1, right);
    
        int[] temp = new int[right-left+1];                   // 临时数组存放合并结果
        int i=left,j=mid+1;
        int cur = 0;
        while (i<=mid&&j<=right) {                            // 开始合并数组
            if (nums[i]<=nums[j]) temp[cur] = nums[i++];
            else temp[cur] = nums[j++];
            cur++;
        }
        while (i<=mid) temp[cur++] = nums[i++];
        while (j<=right) temp[cur++] = nums[j++];
    
        for (int k = 0; k < temp.length; k++) {             // 合并数组完成，拷贝到原来的数组中
            nums[left+k] = temp[k];
        }
    }

    public void mergesoft(int[] nums, int left,int right) {
        if(left >= right) return;
        int mid = (left + right)/2;

        mergesoft(nums, left, mid);
        mergesoft(nums, mid+1,right);

        int i = left,j = mid+1,cur = 0;
        int[] temp = new int[right-left+1];
        while(i<=mid&&j<=right) {
            if(nums[i]<nums[j]) temp[cur++] = nums[i++];
            else temp[cur++] = nums[j++];
        }

        while(i<=mid) temp[cur++] = nums[i++];
        while(j<=right) temp[cur++] = nums[j++];

        System.arraycopy(temp, 0, nums, left, temp.length);
    }
}