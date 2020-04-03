package al.tree;

public class tree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return this.root;
    }

    public void fontShow() {
        root.fontShow();
    }

    public void midShow() {
        root.midShow();
    }

    public void endShow() {
        root.endShow();
    }

    public TreeNode fontSearch(int i) {
        return root.fontSearch(i);
    }

    public void delete(int i) {
        root.delete(i);
    }

}