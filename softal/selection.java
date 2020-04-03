package softal;

public class selection{
    int[] arr;
    
    // 选择排序的思路比较简单，先找到前n个元素中最大的值，然后和最后一个元素交换，这样保证最后一个元素一定是最大的
    // 然后找到前n-1个元素中的最大值，和第n-1个元素进行交换
    // 其实整个过程和冒泡排序差不多，都是要找到最大的元素放到最后
    // 不同点是冒泡排序是不停的交换元素，而选择排序只需要在每一轮交换一次。
    public selection(int[] temp) {
        int len = temp.length;
        for(int i = len - 1; i > 0; i--) {
            int index = i,key = temp[i];
            for(int j = i;j > 0; j--) {
                if(temp[j] > key) {
                    key = temp[j];
                    index = j;
                }
            }
        }
        this.arr = temp;
    }
}