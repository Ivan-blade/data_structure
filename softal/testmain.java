package softal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// 参考https://leetcode-cn.com/problems/sort-an-array/solution/shi-er-chong-pai-xu-suan-fa-bao-ni-man-yi-dai-gift/
// 部分参考算法导论伪代码
public class testmain{
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,1,4,2,6,2,7,3,8,1};

        // 优先队列排序
        // PriorityQueue<Integer> queue = new PriorityQueue<>();
        // PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        // for(int i = 0;i<arr.length;i++) {
        //     System.out.print(arr[i]+" ");
        //     queue.add(arr[i]);
        // }
        // System.out.println(" ");
        // while(!queue.isEmpty()) {
        //     System.out.print(queue.poll()+ " ");
        // }

        // 冒泡
        // bubble bub = new bubble(arr);
        // System.out.println(Arrays.toString(bub.arr));

        // 选择
        // selection sel = new selection(arr);
        // System.out.println(Arrays.toString(sel.arr));

        // 插入
        // insertion ins = new insertion(arr);
        // System.out.println(Arrays.toString(ins.arr));

        // 堆排序
        // 待会看
        // heap hea = new heap(arr);
        // System.out.println(Arrays.toString(hea.arr));

        // 希尔排序
        // shell she = new shell(arr);
        // System.out.println(Arrays.toString(she.arr));

        // 归并排序
        // 还不是特别能理解
        merge mer = new merge(arr);
        System.out.println(Arrays.toString(mer.arr));

        // 快速排序
        // quick qui = new quick(arr);
        // System.out.println(Arrays.toString(qui.arr));

        // 桶排序
        // 再议
        // bucket buc = new bucket(arr);
        // System.out.println(Arrays.toString(buc.arr));

        // 计数排序
        // counting cou = new counting(arr);
        // System.out.println(Arrays.toString(cou.arr));

        // 基数排序
        // radix rad = new radix(arr);
        // System.out.println(Arrays.toString(rad.arr));

    }
}