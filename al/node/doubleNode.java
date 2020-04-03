package al.node;

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