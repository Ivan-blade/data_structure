package softal;

public class quick{
    int[] arr;

    public quick(int[] temp) {
        quicksoft1(temp, 0, temp.length-1);
        // quicksoft2(temp, 0, temp.length-1);
        this.arr = temp;
    }

    // 其核心的思路是取第一个元素（或者最后一个元素）作为分界点，把整个数组分成左右两侧
    // 左边的元素小于或者等于分界点元素，而右边的元素大于分界点元素，然后把分界点移到中间位置
    // 对左右子数组分别进行递归，最后就能得到一个排序完成的数组。
    // 当子数组只有一个或者没有元素的时候就结束这个递归过程。
    public void quicksoft1(int[] temp,int left,int right) {
        if(left >= right) return;
        int lo = left+1;
        int hi = right;
        while(lo<=hi) {
            if(temp[lo] > temp[left]) {
                int x = temp[hi];
                temp[hi] = temp[lo];
                temp[lo] = x;
                hi--;
            } else {
                lo++;
            }
        }
        lo--;
        int j = temp[left];
        temp[left] = temp[lo];
        temp[lo] = j;
        quicksoft1(temp,left,lo-1);  
        quicksoft1(temp,lo+1,right); 
    }

    // 第二种，不用hi来标记大于分界点元素的最右侧，而是只用一个lo来标记最左侧。
    // 在遍历整个数组的过程中，如果发现了一个小于等于分界点元素的元素，就和lo+1位置的元素交换，然后lo自增
    // 这样可以保证lo的左侧一定都是小于等于分界点元素的，遍历到最后lo的位置就是新的分界点位置，和最开始的分界点元素位置互换。

    public void quicksoft2(int[] temp,int left,int right) {
        if(left>=right) return;
        int cur = left + 1;
        int lo = left;
        while(cur <= right) {
            if(temp[cur] <= temp[left]) {
                int x = temp[cur];
                temp[cur] = temp[lo+1];
                temp[lo+1] = x;
                lo++;
            } 
            cur++;
        }
        int j = temp[lo];
        temp[lo] = temp[left];
        temp[left] = j;
        quicksoft2(temp, left, lo-1);
        quicksoft2(temp, lo+1, right);
    }
}