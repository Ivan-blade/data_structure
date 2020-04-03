#### 排序(名称-一般时间复杂度--空间复杂度)
+ https://leetcode-cn.com/problems/sort-an-array/solution/shi-er-chong-pai-xu-suan-fa-bao-ni-man-yi-dai-gift/
+ 稳定性概念--如果两个相同的数字，经过多次排序，在结果序列中顺序相对不变则该算法是稳定的，否则不稳定
+ 只看一行总结性描述
+ 选择--n2--1(selection)
    + 进行n轮迭代，记录前n个数中最大的数并将它放在数组的最末端，当迭代结束时该数组就是一个有序数组了
        + 找到前n个数中最大数字的位置，与第n个元素交换位置
        + 找到前n-1个数中最大数字的位置，与第n-1个元素交换位置，以此迭代
        + 每轮排序将前范围内最大的数放在最后一位
+ 冒泡--n2--1(bubble)
    + 进行n轮排序，每轮排序将会比较各相邻数字的大小，大的右移，确保每轮迭代后最后一位数字最大
+ 插入--n2--1(insertion)
    + 进行n轮迭代，从第一轮迭代开始确保前n个数是有序的，每次迭代将新增的一个数字插入到有序数组适当的位置保证数组依旧有序
+ 堆排序--nlog2n--1(heap)
    + 将数组变为最大堆，每次从堆顶取出最大元素，依次取出的元素构成一个有序序列，堆排序的核心是新建堆和弹出元素后的重建堆
    + 新建堆在原数组上操作就可以了，数组可以看成一颗最外层没有填满的完全二叉树，对于下标为i的节点，他的左右孩子是2*i+1和2*i+2
    + 新建堆从左向右遍历，每遍历一个元素将该节点到根节点重新排列，从而满足最大堆的需求，遍历完所有节点时，最大堆就完成了
    + 当每次弹出根节点时（将顶层元素和最底层最右侧元素进行互换），堆被破坏需要重建，从根节点开始和两个子节点比较，如果父节点比最大子节点小，那么互换父节点和最大子节点，然后将互换到子节点位置的父节点与下一层孩子节点比较，知道最后一层重建堆完成
+ 希尔排序--n1.3--1(shell)
    + 将数组拆分为多个序列，每个序列直接的间隔为gap（gap可以参考(length-1)/2获得）
    + 进行gap轮迭代（执行条件gap > 0，每轮迭代gap自除2）
    + 每轮迭代单独对各个子序列进行插入排序或者冒泡排序，直到迭代终止 
+ 归并排序--nlog2n-n(merge)
    + 将数组分为左右两段，分别排序，排序完成之后合并再排序，整个过程递归进行，当只剩下一个元素或者没有元素时，直接返回
+ 快速排序--nlog2n-nlog2n(quick)
    + 使用第一个或者最后一个元素作为分界点，将数组分为左右两侧，小的在左，大的在右，然后将分界点移动到中间，对左右序列进行递归，当子序列只有一个元素或者没有元素时结束整个过程
    + 具体实现两种
        + 同时记录首尾位置作为左右指针，当左指针代表的元素大于右指针代表的元素是，交换元素，右指针递减，如果不发生交换，左指针递增，当左指针=右指针时，迭代结束
        + 同时记录第一位元素a和第二位元素b，b元素一直自增，当b代表元素<=a代表元素时交换a和b元素位置，a自增，到最后a的位置就是分界点，终止条件b>length
+ 桶排序--n+k--n+k(bucket)
    + 定义桶的区间，根据最大值与最小值的差值计算需要桶的数量
    + 遍历数组将所有元素放到对应的桶当中，对桶中的元素进行排序
    + 将所有桶中的元素还原到原数组中
+ 计数排序--n+k--n+k(counting)
    + 遍历找到数组中的最大元素和最小元素
    + 创建一个长度为最大最小元素差值的数组，分别对应每一个元素
    + 统计每个元素出现的频率保存在数组对应的下标中
    + 根据新数组中的下标和频率将元素放回老数组中
+ 基数排序--n+k--n+k(radix)
    + 类似桶排序，但是桶被固定为了十个，0-9
    + 计算出最大数字的位数，根据位数进行迭代
    + 先将个位为0-9的数放入十个桶
    + 然后按桶的顺序取出再将十位为0-9的数字放入桶中再取出（位数不足按0计算），直到最高位也放进桶里

+ 如果对时间复杂度要求比较高并且键的分布范围比较广，可以使用归并排序、快速排序和堆排序。

+ 如果不能使用额外的空间，那么快速排序和堆排序都是不错的选择。

+ 如果规定了排序的键的范围，可以优先考虑使用桶排序。

+ 如果不想写太多的代码同时时间复杂度没有太高的要求，可以考虑冒泡排序、选择排序和插入排序。

+ 如果排序的过程中没有复杂的额外操作，直接使用编程语言内置的排序算法就行了