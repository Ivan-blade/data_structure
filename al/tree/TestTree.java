package al.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TestTree {
    public static void main (String[] args) {
        tree binTree = new tree();
        TreeNode root = new TreeNode(4);

        binTree.setRoot(root);

        TreeNode nodel = new TreeNode(2);
        TreeNode noder = new TreeNode(6);
        TreeNode nodell = new TreeNode(1);
        TreeNode nodelr = new TreeNode(3);
        TreeNode noderl = new TreeNode(5);
        TreeNode noderr = new TreeNode(7);

        root.setlNode(nodel);
        root.setrNode(noder);
        nodel.setlNode(nodell);
        nodel.setrNode(nodelr);
        noder.setlNode(noderl);
        noder.setrNode(noderr);

        // TreeNode res = find(root, 1);
        // System.out.print(res);
        // mid(root);
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
        // binTree.delete(2);
        // 内部递归遍历
        // binTree.midShow();
        // 外部递归遍历，并保存为数组
        // List<Integer> list = new ArrayList<>();
        // inshow(root,list);
        // for(int num : list) {
        //     System.out.print(num+ " ");
        // }
    }

    // 外部递归中序遍历
    // public static void inshow(TreeNode node,List<Integer> list) {
    //     if(node != null) {
    //         inshow(node.lNode,list);
    //         list.add(node.value);
    //         inshow(node.rNode,list); 
    //     }
    // }

    // 外部堆栈模拟中序遍历（pop的顺序就是遍历顺序）
    // 先将左孩子全部压入，当node等于null表示左孩子已经全部压入，再开始弹出
    // 先弹出堆栈最上层元素，再将node指向右节点
        // public static void mid(TreeNode root) {
        //     TreeNode node = root;
        //     Deque<TreeNode> stack = new LinkedList<>();
        //     while(node != null || !stack.isEmpty()) {
        //         stack.push(node);
        //         node = node.lNode;
        //         while(node == null && !stack.isEmpty()) {
        //             node = stack.pop();
        //             System.out.print(node.value +" ");
        //             node = node.rNode;
        //         }
        //     }
        // }
    // 搜索树查找
    // public static TreeNode find(TreeNode root,int i) {
    //     if(root == null) return null;
    //     TreeNode node = root;
    //     while(node != null) {
    //         if(i < node.value) {
    //             node = node.lNode;
    //         } else if(i > node.value) {
    //             node = node.rNode;
    //         } else {
    //             return node;
    //         }
    //     }
    //     return null;
    // }
}