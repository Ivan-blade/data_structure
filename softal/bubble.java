package softal;

public class bubble{
    int[] arr;

    // 从左到右依次比较相邻的两个元素，如果前一个元素比较大，就把前一个元素和后一个交换位置
    // 遍历数组之后保证最后一个元素相对于前面的永远是最大的。
    // 然后让最后一个保持不变，重新遍历前n-1个元素，保证第n-1个元素在前n-1个元素里面是最大的。
    // 依此规律直到第2个元素是前2个元素里面最大的，排序就结束了。

    public bubble(int[] temp) {
        int len = temp.length;
        for(int i = 0;i< len;i++) {
            for(int j = 0;j < len - i - 1;j++) {
                if(temp[j] > temp[j+1]) {
                    int t = temp[j+1];
                    temp[j+1] = temp[j];
                    temp[j] = t;
                }
            }
        }
        this.arr = temp;
    }
}