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
#### 字符串
+ length()
+ charAt()
+ indexOf()
+ replace
```
    String a = "123456789456132";
    String b = "456";
    a = a.replace(b,"");
    System.out.println(a);
```
#### 数组
+ 快速查看数组的变量
    + Arrays.toString(arr)
+ Array.copyOfRange(arr,from,to)(复制返回选中数组，from闭to开)
    ``` 
        import java.util.*;

        int[] arr = new int[] {1,2,3};
        int[] temp = Arrays.copyOfRange(arr,0,arr.length);
        System.out.println(Arrays.toString(temp));

    ```
+ ArrayList
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
            arr[i] = s.cahrAt(i);
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
+ 取理论最大值和理论最小值
    + Integer.MAX_VALUE
    + Integer.MIN_VALUE
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