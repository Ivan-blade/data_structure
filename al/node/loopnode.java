package al.node;

public class loopnode {
    // 节点数据
    int data;
    //下一个节点
    loopnode next = this;

    public loopnode(int data) {
        this.data = data;
    }

    //插入节点
    public void insert(loopnode loopnode) {
        // 取出当前节点next作为插入节点的next
        loopnode newNext = next;
        // 将插入节点赋值到当前节点
        this.next = loopnode;
        // 指定下一个节点的下一个节点
        loopnode.next = newNext;
    } 

    //删除下一个节点
    public void remove() {
        // 其实是将当前节点的指针指向下下一个节点
        // 获取下下一个节点
        loopnode newNext = next.next;
        // 赋值
        this.next = newNext;
    }


    // 获取下一个节点
    public loopnode next() {
        return this.next;
    }

    //获取节点中的数据
    public int getData() {
        return this.data;
    }
}