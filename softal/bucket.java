package softal;

import java.util.ArrayList;
import java.util.List;

public class bucket {
    int[] arr;

    public bucket(int[] temp) {
        bucketSort(temp);
        this.arr = temp;
    }

    private void bucketSort(int[] nums) {
        int INTERVAL = 100;               // 定义桶的大小
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {            // 找到数组元素的范围
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int count = (max - min + 1);      // 计算出桶的数量
        int bucketSize = (count % INTERVAL == 0) ?( count / INTERVAL) : (count / INTERVAL+1);
        List<Integer>[] buckets = new List[bucketSize];
        for (int num : nums) {            // 把所有元素放入对应的桶里面
            int quotient = (num-min) / INTERVAL;
            if (buckets[quotient] == null) buckets[quotient] = new ArrayList<>();
            buckets[quotient].add(num);
        }
        int cur = 0;
        for (List<Integer> bucket : buckets) {
            if (bucket != null) {
                bucket.sort(null);       // 对每个桶进行排序
                for (Integer integer : bucket) {  // 还原桶里面的元素到原数组
                    nums[cur++] = integer;
                }
            }
        }
    }
}