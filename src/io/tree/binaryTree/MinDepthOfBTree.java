package io.tree.binaryTree;

import io.tree.TreeNode;

public class MinDepthOfBTree {
    TreeNode root;

    public int minDepth(TreeNode A) {
        if(A==null)
            return 0;
        if(A.left==null && A.right!=null)
            return 1+minDepth(A.right);
        if(A.right==null && A.left!=null)
            return 1+minDepth(A.left);
        return 1+Math.min(minDepth(A.left), minDepth(A.right));
    }

    public static void main(String[] args) {
        MinDepthOfBTree obj = new MinDepthOfBTree();
        obj.root = new TreeNode(1);
        obj.root.right = new TreeNode(3);
        obj.root.left = new TreeNode(2);
        obj.root.right.right = new TreeNode(5);
        obj.root.right.right.right = new TreeNode(7);
        System.out.println(obj.minDepth(obj.root));
    }
}
