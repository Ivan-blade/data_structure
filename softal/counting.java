package softal;

public class counting{
    int[] arr;

    // 计数排序是一个最基本的非比较排序，能够将时间复杂度提高到O(n)O(n)的水平，但是使用上比较有局限性
    // 通常只能应用在键的变化范围比较小的情况下，如果键的变化范围特别大，建议使用基数排序。

    // 计数排序的过程是创建一个长度为数组中最小和最大元素之差的数组
    // 分别对应数组中的每个元素，然后用这个新的数组来统计每个元素出现的频率
    // 然后遍历新的数组，根据每个元素出现的频率把元素放回到老的数组中，得到已经排好序的数组。

    public counting(int[] temp) {
        countSort(temp);
        this.arr = temp;
    }

    public void countSort(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {            // 找到最大最小值
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] count = new int[max-min+1]; // 建立新数组
        for (int num : nums) {            // 统计每个元素出现频率
            count[num-min]++;
        }
        int cur = 0;
        for (int i = 0; i < count.length; i++) {  // 根据出现频率把计数数组中的元素放回到旧数组中
            while (count[i]>0) {
                nums[cur++] = i+min;
                count[i]--;
            }
        }
    }
}