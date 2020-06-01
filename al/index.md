### 算法数据结构
#### 线性结构
##### 数组
+ 基本使用
    + 创建数组
        ```java
            int[] arr = new int[3];
            int[] arr = new int[] {1,2,3,4,5};
        ```
    + 获取长度
        ```java
            int len = arr.length;
        ```
    + 复制数组
        ```
            int[] a = {1,2,3};
            int[] b = new int[3];
        ```
        + 完全复制（更改复制数组时，原数组也会发生改变）
            ```
                b = a;
            ```
        + 仅复制数值（完全独立的新数组）
            + for循环赋值
            + System的静态方法arraycopy()
                + public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
                    + src:源数组
                    + srcPos:源数组要复制的起始位置
                    + dest:目的数组
                    + destPos:目的数组放置的起始位置
                    + length:复制的长度
                    ```
                        System.arraycopy(a,0,b,0,3);
                    ```
    + 解决数组长度不可变问题（想要向数组中插入新的元素但是空间不够）
        + 创建新数组
        + 遍历原数组并将数组传输给新数组
        + 插入新元素
        + 将新数组赋值给旧数组
        ```
            int[] arr = new int[] {1,2,3};
            int[] temp = new int[arr.length+1];
            for(int i=0;i<arr.length;i++) {
                temp[i] = arr[i];
            }
            temp[arr.length] = 4;
            arr = temp
        ```
    + 删除数组中元素（也是重新赋值）
        + 创建新数组，长度为原数组长度-1
        + 记录需要删除元素的索引
        + 使用for循环遍历，遍历过程中对索引进行判断，删除元素索引跳过
        + 将新数组赋值给旧数组
        ```
            int[] arr = new int[] {1,2,3,4,5}
            int delIndex = 3
            int[] temp = new int[arr.length-1]
            for(int i = 0 ;i<temp.length;i++) {
                if(i < delIndex) {
                    temp[i] = arr[i];
                } else {
                    temp[i] = arr[i+1];
                }
            }
            arr = temp;
        ```
    + 快速查看数组中的值（不需要使用for循环）
        ```
            Array.toString(arr)
        ```
    + 二分法
        + start，end记录边界
        + mid = (start+end)/2  中间索引
        + 对每次的arr[mid]做判断
            + 如果arr[mid]大于target,end = mid -1
            + 如果arr[mid]小于target,start = mid + 1
            + 对mid重新赋值
        + 实现
            ```
                public class test {
                    public static void main(String args[]) {
                        int target = 5;
                        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
                        int start = 0;
                        int end = arr.length-1;
                        int mid = (start+end)/2;
                        int res = -1;
                        while(true) {
                            if(arr[mid] == target) {
                                res = mid;
                                break;
                            } else {
                                if (arr[mid] > target) {
                                    end = mid - 1;
                                } else {
                                    start = mid + 1;
                                }
                                mid = (start+end)/2;
                            }
                        }
                        System.out.println("result: "+ res);
                    }
                }
            ```
##### 栈
+ 基本概念
    + 先进后出
+ 基本使用
##### 队列
##### 单链表
+ 基础定义
    ``` 
        public class Node {
            // 节点数据
            int data;
            //下一个节点
            Node next;

            public Node(int data) {
                this.data = data;
            }

            // 增加节点
            public void append(Node node) {
                // 选中当前节点
                Node curnode = this;
                while(true) {
                    // 获取当前节点的下一个节点
                    Node nextNode = curnode.next;
                    // 如果不存在下一个节点，循环终止
                    if(nextNode == null) {
                        break;
                    }
                    //寻找到下一个节点后，将当前节点变更为下一个节点，继续迭代，直到找到最后一个节点为止
                    curnode = nextNode;
                }
                curnode.next = node;
            }

            //删除下一个节点
            public void remove() {
                // 其实是将当前节点的指针指向下下一个节点
                // 获取下下一个节点
                Node newNext = next.next;
                // 赋值
                this.next = newNext;
            }


            // 获取下一个节点
            public Node next() {
                return this.next;
            }

            //获取节点中的数据
            public int getData() {
                return this.data;
            }
        }
    ```
##### 循环链表
+ 与单链表的区别，没有首尾，是无线循环的
+ 几乎和单链表没啥区别，就是next = this,然后末尾增加功能删除了，因为没有末尾
+ 基本使用
    ``` 
        public class Node {
            // 节点数据
            int data;
            //下一个节点
            Node next = this;

            public Node(int data) {
                this.data = data;
            }

            //插入节点
            public void insert(Node node) {
                // 取出当前节点next作为插入节点的next
                Node newNext = next;
                // 将插入节点赋值到当前节点
                this.next = node;
                // 指定下一个节点的下一个节点
                node.next = newNext;
            } 

            //删除下一个节点
            public void remove() {
                // 其实是将当前节点的指针指向下下一个节点
                // 获取下下一个节点
                Node newNext = next.next;
                // 赋值
                this.next = newNext;
            }


            // 获取下一个节点
            public Node next() {
                return this.next;
            }

            //获取节点中的数据
            public int getData() {
                return this.data;
            }
        }
    ```
##### 循环双链表
+ 基本概念
    + 只是比单链表多了一个前置指针
+ 基本使用
    ```
        package 算法与数据结构.node;

        public class doubleNode {
            int data;
            doubleNode pre = this;
            doubleNode next = this;
            
            public doubleNode(int data) {
                this.data = data;
            }

            //增加节点
            //找到下一个节点，先保留再复制
            public void addNode (doubleNode node) {
                // 获取原先的next
                doubleNode newnext = next;
                // 将添加节点next指向原先next
                node.next = newnext;
                // 将原先阶段的pre指向添加节点
                newnext.pre = node;
                // 将添加节点pre指向当前节点
                node.pre = this;
                // 将当前节点的next指向添加节点
                this.next = node;
            }
        }
    ```
##### 递归和斐波那契数列
+ 调用自身
    ```
        public class test {
            public static void main(String args[]) {
                // console(5);
                System.out.print(arrDeal(4));
            }

            public static void console(int i) {
                if(i>0) {
                    System.out.println(i--);
                    console(i);
                }
            }

            public static int arrDeal(int i) {
                if(i == 1 || i == 2) {
                    return 1;
                } else {
                    return arrDeal(i-1)+arrDeal(i-2);
                }
            }
        }
    ```
+ 汉诺塔递归
    ```
        public class test {
            public static void main(String args[]) {
            show(2,'A','B','C');
            }

            public static void show(int n,char from,char in,char to) {
                if(n == 1) {
                    System.out.println("第1个盘子从"+from+"运到"+to);
                } else {
                    show(n-1,from,to,in);
                    System.out.println("第"+n+"个盘子从"+from+"运到"+to);
                    show(n-1,in,from,to);
                }
            }
        }
    ```
##### 排序算法
+ 交换排序
    + 冒泡排序
        + 每轮对相邻两位做比较，大的交换到后一位，一轮结束将最大的数组放在末尾
        + 每一轮结束都能确定这轮最大的数在末位从而减少比较，每一轮结束，都可以减少一次比较
        ```
            public class test {
                public static void main(String args[]) {
                    int[] arr = new int[] {1,4,2,6,3,5};
                    soft(arr);
                    for(int num: arr) {
                        System.out.print(num);
                    }
                }
                public static void soft (int[] arr) {
                    for(int i = 0;i<arr.length-1;i++) {
                        for(int j=0;j<arr.length-1-i;j++) {
                            if(arr[j] > arr[j+1]) {
                                int temp = arr[j+1];
                                arr[j+1] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                }
            }
        ```
    + 快速排序
+ 插入排序
    + 直接插入排序
    + 希尔排序
+ 选择排序
    + 简单选择排序
    + 堆排序
+ 归并排序
+ 基数排序
#### 图结构
+ 基本概念
    + 图结构是一种非线性数据结构，每个元素之间可以互相关联
    + 图结构
        + 顶点
        + 边
    + 邻接
    + 路径
    + 有向图
        + 图中边有方向性叫做有向图
    + 无向图
        + 图中边没有方向性叫做有向图
    + 带权图
        + 图中的顶点被赋予的值叫权
    + 遍历方式
        + 深度遍历
            + 从随机点开始遍历
            + 不断遍历邻接节点，当所有邻接节点已经遍历过或者不存在邻接节点时返回上一个节点继续遍历，直到返回第一个随机点
        + 广度遍历
            + 遍历所有节点
            + 每轮遍历访问所有该节点所有邻接节点
#### 树结构
+ 种类
    + 二叉树
        + 每个节点最多有两个节点
    + avl树（平衡树）
        + 所有节点左右子树差小于1
    + 二叉搜索树
        + 左子树所有节点值小于它的根节点
        + 右子树所以节点值大于它的根节点
    + B树（也叫B-树）
        + 根节点及内部节点有两个子节点
        + 所有叶子在同一层
        + 有k个关键字的非叶子节点恰好有k+1个孩子
    + B+树
        + 非叶子节点不存放数据，只存放keys
        + B+树的叶子节点之间存在指针相连而且是单链表
+ 基本概念
    + 节点的度--子节点的数量
    + 节点的权--节点上赋予的数值
+ 二叉树
    + 定义：任何一个节点的数量都不超过2
    + 特点(数字代表含有子节点数量)
        + n0 = n2 + 1
        + n(二叉树总节点) = n0 + n1 + n2
    + 延伸
        + 满二叉树
            + 所有叶子节点都在最后一层，并且节点数为2^n-1
        + 完全二叉树
            + 所有叶子节点都在最后一层或者倒数第二层，并且最后一层的叶子节点必须是从左开始延续，不能间断，倒数第二层的叶子在右边延续
    + 基本使用
        + 创建二叉树
            + Tree
                + 创建根节点就好了
            + TreeNode
                + data
                + 左孩子节点
                + 右孩子节点
                + 两个节点的set方法
            + 使用
                + 主函数创建tree对象
                    + 创建treenode对象
                    + tree.setroot设置根节点
                    + 创建新节点，使用节点的设置方法添加为根节点的左孩子和右孩子
        + 遍历二叉树
            + 前序遍历
                + 中左右
            + 中序遍历（会是升序）
                + 左中右
            + 后序遍历
                + 左右中
            + 实现
                + 在节点中定义输出value的方法就好，如果存在左右节点使用递归循环输出，不同遍历只要更换顺序就好
        + 暴力删除节点
    + 链式存储二叉树
    + 顺序存储二叉树
        + 只考虑完全二叉树
            + 完全二叉树特性
                + 第n个元素的左子节点： 2*n + 1
                + 第n个元素的右子节点： 2*n + 2
                + 第n个元素的父子节点： (n-1)/2 
            + 在数组中存储二叉树上面的公式就显得尤其重要
    + 线索二叉树
        + 对于没有左孩子或者右孩子的节点，将他们的空余指针指向前后的节点，左指针指向前一个节点，右指针指向后一个节点
        + 如何判断前后呢？根据遍历类型得出的结果判断，比如使用先序遍历结果为123，那么1在2前，3在2后
#### 哈希表