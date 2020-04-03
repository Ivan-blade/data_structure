package softal;

import java.util.ArrayList;
import java.util.List;

public class radix {
    int[] arr;

    // 基数排序和桶排序有点相似，基数排序中需要把元素送入对应的桶中，不过规则是根据所有数字的某一位上面的数字来分类。
    // 假设当前数组的所有元素都是正数，桶的数量就固定在了10个，然后计算出最大元素的位数。
    // 首先根据每个元素的最低位进行分组，比如1就放入1这个桶，13就放入3这个桶，111也放入1这个桶
    // 然后把所有的数字根据桶的顺序取出来，依次还原到原数组里面。
    // 在第二轮从第二位开始分组，比如1（看作01）放入0这个桶，13放入1这个桶，111也放入1这个桶，
    // 再把所有的元素从桶里面依次取出放入原数组。
    // 经过最大元素位数次的这样的操作之后，还原得到的数组就是一个已经排好序的数组。
    public radix(int[] temp) {
        radixSort(temp);
        this.arr = temp;
    }
    private void radixSort(int[] nums) {
        int max = -1;
        int min = 1;
        for (int num : nums) {         // 计算最大最小值
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        max = Math.max(max, -min);     // 求得绝对值最大的值
        int digits = 0;
        while (max > 0) {              // 计算绝对值最大的值的位数
            max /= 10;
            digits++;
        }
        List<Integer>[] buckets = new List[19]; // 建一个包含所有位数的数组
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        int pos;
        int cur;
        for (int i = 0, mod = 1; i < digits; i++, mod*=10) { // 对十进制每一位进行基数排序
            for (int num : nums) {                 // 扫描数组将值放入对应的桶
                pos = (num / mod) % 10;
                buckets[pos+9].add(num);
            }
            cur = 0;
            for (List<Integer> bucket : buckets) { // 将桶内元素放回到数组里面
                if (bucket!=null) {
                    for (Integer integer : bucket) {
                        nums[cur++] = integer;
                    }
                    bucket.clear();                // 将桶清空
                }
            }
        }
    }    
}