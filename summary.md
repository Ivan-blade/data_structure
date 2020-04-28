### 长度
+ 字符串长度获取
    + str.length()
+ 一维数组长度获取
    + arr.length
+ 二维数组长度获取
    + 行数
        + arr.length
    + 列数
        + arr[0].length

### 常用方法
#### 单位转换
+ char转为int
    + 想要将int类型的10转换为char类型的10除了类型转换还需要做处理
        + 强制类型转换会将int类型当做ascll码解析，所以我们需要加上48或者加上'0'
            ```
                int a = 1;
                char b = (char)(a+'0');
                char b = (char)(a+48);
                System.out.println(b);
            ```
#### Integer进制转换
+ 十进制转其他
    + 十进制转二进制
        + Integer.toBinaryString(2)
    + 十进制转八进制
        + Integer.toOctalString(8)
    + 十进制转十六进制
        + Integer.toHexString(16)
    + 十进制转其他进制
        + Integer.toString(int i,int radix)
            + 将十进制的i转换成string类型的radix进制数
            + Integer.toString(2,2)
            + 将十进制2转换成2进制2
+ 其他转十进制
    + Integer.parseInt(String s,int radix) 
        + 将radix进制String类型的数转换为十进制的数
        + Integer.parseInt("F",16)
        + 将十六进制的F转化为十进制数
+ 取理论最大值和理论最小值
    + Integer.MAX_VALUE
    + Integer.MIN_VALUE
#### Scanner
+ 逐个处理多个字符
    ```
        Scanner input = new Scanner(System.in)
        while(input.hasNext()) {
            int temp = input.nextInt();
            System.out.println(temp;)
        }
    ```
#### StringBuffer
    ```
        StringBuffer sb = new StringBuffer();
        char a = "a";
        char b = "b";
        sb.append(a);
        sb.append(b);
        String res = sb.toString();
    ```
#### 字符串
+ length()
+ charAt()
+ toCharArray() 转字符数组
+ indexOf()
+ replace()
```
    String a = "123456789456132";
    String b = "456";
    a = a.replace(b,"");
    System.out.println(a);
```
+ substring(start,end);



#### 栈stack
```
    Stack<Character> stack = new Stack();
    stack.pop()
    stack.push()
    stack.isEmpty()
    stack.peek()    -- 获取栈顶的值
    stack.clear()
```
#### 队列queue
```
    Deque<Integer> queue = new LinkedList<>();
    add()   入队
    peek()  获取不移除队头
    poll()  获取并移除队头
```

#### 数组
+ 数组判断为空的方式
    + arr.length == 0 || arr = null;
+ 快速查看数组的变量
    + Arrays.toString(arr)
+ Array.copyOfRange(arr,from,to)(复制返回选中数组，from闭to开)
    ``` 
        import java.util.*;

        int[] arr = new int[] {1,2,3};
        int[] temp = Arrays.copyOfRange(arr,0,arr.length);
        System.out.println(Arrays.toString(temp));

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
#### 动态数组
+ ArrayList(动态数组)
    + 创建
        ```
            ArrayList list = new ArrayList();
        ```
    + 其他
        ```
            list.add()                          // 添加元素
            list.insert(int index,value)        // 插入元素，插入处开始原先值后移
            list.remove(index)                  // 根据索引删除元素--索引从0开始
            list.get(index)                     // 查询对应索引的值
            list.set(index,value)               // 更改索引处的值
            list.size()                         // 获取list长度
            list.equals(list2)                  // 两个list比对
            -----------------------------------------------------------------------
            下面三种方式只是简单的循环遍历查找，效率不高
            list.contains(value)                // 判断是否存在
            list.indexOf(value)                 // 寻找该值第一次出现的位置
            list.lastIndexOf(value)             // 寻找该值最后一次出现的位置
            -----------------------------------------------------------------------
        ```
    + 转换
        + ArrayList转数组
            ```
                String[] temp1 = new String[]{"王利虎","张三","李四"}; 
                List<String> list = Arrays.asList(temp1);
            ```
        + 数组转ArrayList
##### 字符数组
+ 字符数组与字符串互相转化
    ```
        String newstr = new String(arr,0,length)
        ------------------------------------------
        String s = 'hello';
        int[] arr = new int[s.length()];
        for(int i = 0;i < s.length();i++) {
            arr[i] = s.charAt(i);
        }
    ```
+ 判断字符串中字符数量
    ```
        String s = 'abcd';
        int length = s.length();
    ```
#### math类
+ 绝对值----Math.abs()
+ 向下取整----Math.floor()
+ 四舍五入----Math.round()
+ 取随机数----Math.random()----左闭右开
    + 取随机整数----(int)(100*Math.random())----[0,100)随机整数
+ 取幂函数----Math.pow(a,b)a的b次方
+ 开根----Math.sqrt(num)num的平方根
+ 返回两数较大----Math.max(a,b)
#### 哈希
+ hashset
    + 创建
        ```
            Set<Integer> set = new HashSet<>();
            HashSet<Integer> set = new HashSet<>();
        ```
    + 其他
        ```
            add();          //增加
            remove();       //删除
            contains();     //包含
            clear();        //清空集合
            size();         //长度
        ```
+ hashmap
    + 创建
        ```
            Map<String,Integer> map= new HashMap<>();
        ```
    + 其他
        ```
            map.put(string,int);                    // 存入键值对
            map.get(string);                        // 根据键获取值
            map.size();                             // 获取数量
            boolean b1 = map.containsKey(string);   // 判断是否存在该键
            boolean b2 = map.containsValue(int);    // 判断是否存在该值
            boolean b3 = map.isEmpty();             // 判断map是否为空
            map.remove(string);                     // 根据键移出该键值
            map.clear();                            // 移除所有键值对
        ```
#### 优先队列
+ priorityQueue
    ```
        PriorityQuene<Integer> heap = new PriorityQuene<>(Comparator.reverseOrder());
        // 新建优先队列
        heap.add()
        // 增加元素
        heap.poll()
        // 弹出堆顶元素
        while(!queue.isEmpty()) {
            System.out.print(queue.poll()+ " ");
        }
        // 遍历方式
    ```
#### 双端队列
+ Deque（方法包含了队列和堆栈的所有方法）
    + 既可以当堆栈使用又可以当队列使用。。。甚至可以同时作为队列和堆栈使用
    + 新建种类
        + LinkedList 大小可变的链表双端队列，允许元素为 null
        + ArrayDeque 大小不可变的数组双端队列，不允许 null
        + 并发场景
            + LinkedBlockingDeque 如果队列为空时，获取操作将会阻塞，知道有元素添加
        ```
            创建
            Deque<可选> deque = new LinkedList();
        ```