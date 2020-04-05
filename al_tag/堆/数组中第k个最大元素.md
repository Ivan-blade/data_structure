### 数组中第k个最大元素
+ 描述
+ 思路
    + 构建一个优先队列（该队列是一个最小堆，顶部元素最小）
    + 将数据中所有元素插入，当数量大于k时开始弹出最顶部元素，最后剩下的k个元素就是最大的几个，顶部的元素，就是第k个最大元素
+ 方法
    ```
        PriorityQuene<Integer> heap = new PriorityQuene<>();
        // 新建优先队列
        heap.add()
        // 增加元素
        heap.poll()
        // 弹出栈顶元素
    ```
+ 题解
```
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // init heap 'the smallest element first'
        // PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        // 上面的不知道是干什么用的
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        // keep k largest elements in the heap
        for (int n: nums) {
          heap.add(n);
          if (heap.size() > k)
            heap.poll();
        }

        // output
        return heap.poll();        
  }
}
```