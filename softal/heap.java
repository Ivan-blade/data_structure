package softal;

public class  heap{
    int[] arr;

    public heap(int[] temp) {
        heapSort(temp);
        this.arr = temp;
    }

    // 堆排序是一个效率要高得多的选择排序
    // 首先把整个数组变成一个最大堆
    // 然后每次从堆顶取出最大的元素
    // 这样依次取出的最大元素就形成了一个排序的数组。
    // 堆排序的核心分成两个部分
    // 第一个是新建一个堆
    // 第二个是弹出堆顶元素后重建堆。

    // 新建堆不需要额外的空间，而是使用原来的数组
    // 一个数组在另一个维度上可以当作一个完全二叉树（除了最后一层之外其他的每一层都被完全填充，并且所有的节点都向左对齐）
    // 对于下标为i的元素，他的子节点是2*i+1和2*i+2（前提是没有超出边界）。
    // 在新建堆的时候从左向右开始遍历
    // 当遍历到一个元素的时候，重新排列从这个元素节点到根节点的所有元素，保证满足最大堆的要求（父节点比子节点要大）。
    // 遍历完整个数组的时候，这个最大堆就完成了。

    // 在弹出根节点之后（把根节点的元素和树的最底层最右侧的元素互换）堆被破坏，需要重建。
    // 从根节点开始和两个子节点比较
    // 如果父节点比最大的子节点小，那么就互换父节点和最大的子节点
    // 然后把互换后在子节点位置的父节点当作新的父节点，和它的子节点比较
    // 如此往复直到最后一层，这样最大堆就重建完毕了。

    public void heapSort(int[] temp) {
        heapify(temp);                                 // 新建一个最大堆
        for (int i = temp.length - 1; i >= 1; i--) {
            // 弹出最大堆的堆顶放在最后
            int x = temp[i];
            temp[i] = temp[0];
            temp[0] = x;
            rebuildHeap(temp, 0,i-1);          // 重建最大堆
        }
    }
    
    public void heapify(int[] temp) {
        for (int i = 1; i < temp.length; i++) {
            int par = (i-1)>>1;                       // 找到父节点
            int child = i;                            // 定义子节点
            while (child>0&&temp[par]<temp[child]) {  // 从子节点到根节点构建最大堆
                int x = temp[par];
                temp[par] = temp[child];
                temp[child] = x;
                child = par;
                par = (par-1) >> 1;
            }
        }
    }
    
    public void rebuildHeap(int[] temp, int par, int last) {
        int left = 2*par+1;                           // 左子节点
        int right = 2*par+2;                          // 右子节点
        int maxIndex = left;
    
        if (right<=last && temp[right]>temp[left]) {  // 找到最大子节点
            maxIndex = right;
        }
    
        if (left<=last && temp[par] < temp[maxIndex]) {// 和最大子节点比较
            // 互换到最大子节点
            int x = temp[par];
            temp[par] = temp[maxIndex];
            temp[maxIndex] = x;
            rebuildHeap(temp, maxIndex, last);         // 重建最大子节点代表的子树
        }
    }

}