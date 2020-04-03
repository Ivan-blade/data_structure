package al.tree;

public class TestTree {
    public static void main (String[] args) {
        tree binTree = new tree();
        TreeNode root = new TreeNode(1);

        binTree.setRoot(root);

        TreeNode nodel = new TreeNode(2);
        TreeNode noder = new TreeNode(3);
        TreeNode nodell = new TreeNode(4);
        TreeNode nodelr = new TreeNode(5);
        TreeNode noderl = new TreeNode(6);
        TreeNode noderr = new TreeNode(7);

        root.setlNode(nodel);
        root.setrNode(noder);
        nodel.setlNode(nodell);
        nodel.setrNode(nodelr);
        noder.setlNode(noderl);
        noder.setrNode(noderr);

        // binTree.fontShow();
        // System.out.println("----------------");
        // binTree.midShow();
        // System.out.println("----------------");
        // binTree.endShow();
        // System.out.println("----------------");
        // 先序查找
        // TreeNode result = binTree.fontSearch(3);
        // System.out.println(result);
        // 节点无脑删除
        binTree.delete(2);
        binTree.fontShow();
    }
}