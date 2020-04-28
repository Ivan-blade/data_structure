### 堆
+ 描述
    + 堆（Heap）是一个可以被看成近似完全二叉树的数组。树上的每一个结点对应数组的一个元素。除了最底层外，该树是完全充满的，而且是从左到右填充
+ 方法
    + PriorityQueue
        ```
            PriorityQuene<Integer> heap = new PriorityQuene<>();
            // 新建优先队列
            heap.add()
            // 增加元素
            heap.poll()
            // 弹出堆顶元素
        ```
    + 最大堆最小堆
        ```
            PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); //小顶堆，默认容量为11
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder()); // 大顶堆
        ```
    + 遍历方式
        + 使用for循环挨个弹出会报错，推荐isEmpty循环
        ```
            while(!heap.isEmpty()) {
                System.out.print(heap.poll()+ " ");
            }
        ```