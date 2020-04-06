package temp.Tree;


public class Tree {
    Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public void mid() {
        root.mid();
    }
}