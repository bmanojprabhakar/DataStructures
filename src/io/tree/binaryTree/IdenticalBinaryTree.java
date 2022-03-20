package io.tree.binaryTree;

import io.tree.TreeNode;

public class IdenticalBinaryTree {
    TreeNode rootA;
    TreeNode rootB;

    public int isSameTree(TreeNode A, TreeNode B) {
        if(A==null && B==null)
            return 1;

        if((A==null && B!=null) || (A!=null && B==null))
            return 0;

        if(A.val!=B.val)
            return 0;

        return Math.min(isSameTree(A.left, B.left), isSameTree(A.right, B.right));
    }

    public static void main(String[] args) {
        IdenticalBinaryTree obj = new IdenticalBinaryTree();
        obj.rootA = new TreeNode(1);
        obj.rootA.left = new TreeNode(2);
        obj.rootA.right = new TreeNode(3);

        obj.rootB = new TreeNode(1);
        obj.rootB.left = new TreeNode(2);
        obj.rootB.right = new TreeNode(3);

        System.out.println(obj.isSameTree(obj.rootA, obj.rootB));
    }
}
