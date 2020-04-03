package softal;

public class shell {
    int[] arr;

    // 希尔排序可以看作是一个冒泡排序或者插入排序的变形。
    // 希尔排序在每次的排序的时候都把数组拆分成若干个序列，一个序列的相邻的元素索引相隔的固定的距离gap
    // 每一轮对这些序列进行冒泡或者插入排序
    // 然后再缩小gap得到新的序列一一排序，直到gap为0

    // 比如对于数组[5,2,4,3,1,2]
    // 第一轮gap=3拆分成[5,3]、[2,1]和[4,2]三个数组进行插入排序得到[3,1,2,5,2,4]
    // 第二轮gap=1，拆分成[3,2,2]和[1,5,4]进行插入排序得到[2,1,2,4,3,5]
    // 最后gap=0，全局插入排序得到[1,2,2,3,4,5]

    public shell (int[] temp) {
        int len = temp.length;
        int gap = temp.length >> 1;     // 右移运算符，等同于除2
        while( gap > 0) {
            for(int i = 0;i < gap; i++) {
                for(int j = i+gap; j<len ;j+=gap) {
                    int x = j;
                    // 插入算法
                    while( x > i && temp[x] < temp[x-gap]) {
                        int y = temp[x-gap];
                        temp[x-gap] = temp[x];
                        temp[x] = y;
                        x -= gap;
                    }
                }
            }
            gap >>= 1;
        }
        this.arr = temp;
    }
}