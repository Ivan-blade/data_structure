#### 打印链表中第k个节点
+ 题目描述
    + 输入一个链表，输出该链表中倒数第k个结点。
+ 思路
    + 先获取链表长度，在返回对应位置链表
+ 题解
```
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        int totalNum = 0;
        if(head != null){
            totalNum++;
        }else{
            return null;
        }
        // 计算总的节点数量
        ListNode currentNode = head.next;
        while(currentNode != null){
            totalNum++;
            currentNode = currentNode.next;
        }
 
        if(totalNum < k){
            return null;
        }
        // 倒数第k个为正数第totalNum-k+1个
        ListNode resultNode = head;
        for(int i=1; i<=totalNum-k; i++){
            resultNode = resultNode.next;
        }
        return resultNode;
    }
}
```