package al.tree;

public class TreeNode {
    int value;
    TreeNode lNode;
    TreeNode rNode;

    public TreeNode (int value){
        this.value = value;
    }

    public void setlNode (TreeNode lNode) {
        this.lNode = lNode;
    }

    public void setrNode (TreeNode rNode) {
        this.rNode = rNode;
    }

    // 先序遍历
    public void fontShow() {
        System.out.println(this.value);
        if(this.lNode != null) {
            lNode.fontShow();
        }
        if(this.rNode != null) {
            rNode.fontShow();
        }
    }

    // 中序遍历
    public void midShow() {
        if(this.lNode != null) {
            lNode.midShow();
        }
        System.out.println(this.value);
        if(this.rNode != null) {
            rNode.midShow();
        }
    }

    // 后序遍历
    public void endShow() {
        if(this.lNode != null) {
            lNode.endShow();
        }
        if(this.rNode != null) {
            rNode.endShow();
        }
        System.out.println(this.value);
    }


    // 先序查找
    public TreeNode fontSearch(int i) {
        TreeNode target = null;
        if(this.value == i) {
            return this;
        } else {
            if( lNode != null) {
                target =  lNode.fontSearch(i);
            } 
            if( target != null) {
                return target;
            }
            if( rNode != null ) {
                target = rNode.fontSearch(i);
            }
        }
        return target;
    }

    // 无脑删除节点
    // 节点的删除必须是将它父母的指向变为null，自己是无法进行操作的
    public void delete (int i) {
        TreeNode parent = this;
        if( parent.lNode != null && parent.lNode.value == i) {
            parent.lNode = null;
            return;
        }
        if( parent.rNode != null && parent.rNode.value == i) {
            parent.rNode = null;
            return;
        }
        parent = lNode;
        if(parent != null) {
            parent.delete(i);
        }
        parent = rNode;
        if(parent != null) {
            parent.delete(i);
        }
        
    }
}