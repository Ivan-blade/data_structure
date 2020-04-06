package temp.Tree;

import java.util.Stack;

public class Node{
    int val;

    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public void mid() {
        if(left != null) {
            left.mid();
        }
        System.out.print(val);
        if(right != null) {
            right.mid();
        }

    }
}