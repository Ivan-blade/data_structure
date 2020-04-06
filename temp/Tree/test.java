package temp.Tree;

import java.util.Stack;

public class test {
    public static void main(String[] args) {

        Tree tree = new Tree();
        Node root = new Node(1);

        tree.setRoot(root);

        Node nodel = new Node(2);
        Node noder = new Node(3);
        Node nodell = new Node(4);
        Node nodelr = new Node(5);
        Node noderl = new Node(6);
        Node noderr = new Node(7);

        root.setLeft(nodel);
        root.setRight(noder);
        nodel.setLeft(nodell);
        nodel.setRight(nodelr);
        noder.setLeft(noderl);
        noder.setRight(noderr);

        // tree.mid();
        inshow(root);
    }

    public static void inshow(Node node) {
        if(node != null) {
            inshow(node.left);
            System.out.print(node.val+" ");
            inshow(node.right);
        }
    } 
}