package softal;

public class insertion{
    int[] arr;

    // 插入排序的核心思想是遍历整个数组，保持当前元素左侧始终是排序后的数组，
    // 然后将当前元素插入到前面排序完成的数组的对应的位置，使其保持排序状态。
    // 有点动态规划的感觉，类似于先把前i-1个元素排序完成，再插入第i个元素，构成i个元素的有序数组。

    public insertion(int[] temp) {
        // ins1(temp);
        ins2(temp);
        this.arr = temp;
    } 
    public void ins1(int[] temp) {
        int len = temp.length;
        for(int i = 1; i < len; i++) {
            int j = i;
            while( j > 0 && temp[j] < temp[j-1] ) {
                int x = temp[j];
                temp[j] = temp[j-1];
                temp[j-1] = x; 
                j--;
            }
        }
    }

    // 算法导论版
    // 因为不用每次都进行交换，减少了赋值的次数
    public void ins2(int[] temp) {
        for(int j = 1;j<temp.length;j++) {
            // 记录插入值
            int key = temp[j];
            // 记录遍历起始索引
            int i = j - 1;
            // 对插入值前面所有元素进行匹配，如果目前遍历索引的数值比插入值大，则将该值赋予到该索引的后一位
            while(i >= 0 && temp[i] > key) {
                temp[i+1]  = temp[i];
                i--;
            }
            // 遍历结束后，将插入值插入到适当位置
            temp[i+1] = key;
        }
    }

    public void ins3(int[] temp) {
        int len = temp.length;
        for(int j = 0;j<len;j++) {
            int key = temp[j];
            int i = j -1;
            while(i >= 0 && temp[i] > key) {
                temp[i+1] = temp[i];
                i--;
            }
            temp[i+1] = key;
        }
    }

}


