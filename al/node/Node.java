package al.node;

public class Node {
    // 节点数据
    int data;
    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    // 末尾增加节点
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