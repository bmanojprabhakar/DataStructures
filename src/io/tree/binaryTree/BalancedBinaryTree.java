package io.tree.binaryTree;

import io.tree.TreeNode;

public class BalancedBinaryTree {
    TreeNode root;
    public int isBalanced(TreeNode A) {
        if(A==null)
            return 1;
        if(Math.abs(height(A.left)-height(A.right)) > 1)
            return 0;
        return Math.min(isBalanced(A.left), isBalanced(A.right));
    }

    public int height(TreeNode node) {
        if(node==null)
            return 0;
        return 1+Math.max(height(node.left), height(node.right));
    }

    public static void main(String[] args) {
        BalancedBinaryTree obj = new BalancedBinaryTree();
        obj.root = new TreeNode(1);
        obj.root.left = new TreeNode(2);
        obj.root.left.left = new TreeNode(3);
        System.out.println(obj.isBalanced(obj.root));
    }
}
